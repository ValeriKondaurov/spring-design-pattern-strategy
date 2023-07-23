package org.kvv.designpatterns.strategy.executors;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kvv.designpatterns.strategy.factories.NotificationFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationExecutor {
    private final NotificationFactory notificationFactory;

    @Value("${notification.type:email}")
    private String notificationType;

    public void execute(String message) {
        notificationFactory.execute(notificationType, message);
    }

    public void setNotificationType(String type) {
        log.info("change notify type {} to {}", notificationType, type);
        notificationType = type;
    }
}