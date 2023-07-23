package org.kvv.designpatterns.strategy.factories;

import org.kvv.designpatterns.strategy.NotificationException;
import org.kvv.designpatterns.strategy.strategies.NotificationService;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * A factory class for creating instances of
 * NotificationService based on a provided notification type.
 *
 */
@Component
public class NotificationFactory {

  private final Map<String, NotificationService> notificationServiceMap;

  public NotificationFactory(Map<String, NotificationService> notificationServices) {
    this.notificationServiceMap = notificationServices;
  }

  public NotificationService getNotificationService(String notificationType) {
    NotificationService notificationService = notificationServiceMap.get(notificationType);
    if (notificationService == null) {
      throw new NotificationException("Unsupported notification type");
    }

    return notificationService;
  }

  public void execute(String notificationType, String message) {
    NotificationService notificationService = getNotificationService(notificationType);
    notificationService.sendNotification(message);
  }
}
