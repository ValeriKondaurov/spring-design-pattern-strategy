package org.kvv.designpatterns.strategy.controller;

import org.kvv.designpatterns.strategy.executors.NotificationExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notify")
public class NotificationController {

    @Autowired
    NotificationExecutor executor;

    @PostMapping("/message")
    public ResponseEntity<Void> info(@RequestBody String message) {
        executor.execute(message);
        return ResponseEntity.ok().build();

    }

    @PostMapping
    public ResponseEntity<Void> setNotificationType(@RequestParam String type) {
        executor.setNotificationType(type);
        return ResponseEntity.ok().build();

    }

}
