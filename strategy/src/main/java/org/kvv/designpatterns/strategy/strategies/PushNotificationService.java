package org.kvv.designpatterns.strategy.strategies;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service(NotificationType.PUSH_NOTIFICATION)
public class PushNotificationService implements NotificationService {

  @Override
  public void sendNotification(String message) {
    log.info("Sending push notification - {}", message);
  }
}
