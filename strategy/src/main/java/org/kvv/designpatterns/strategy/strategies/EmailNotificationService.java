package org.kvv.designpatterns.strategy.strategies;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service(NotificationType.EMAIL)
public class EmailNotificationService implements NotificationService {

  @Override
  public void sendNotification(String message) {
    log.info("Sending email with message : {}", message);
  }
}
