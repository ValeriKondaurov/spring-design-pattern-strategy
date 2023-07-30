package org.kvv;

import org.kvv.beer.Beer;
import org.kvv.common.service.OrderService;
import org.kvv.snack.Snack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    @Autowired
    private OrderService<Beer> service;

    @Autowired
    private OrderService<Snack> service2;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


}
