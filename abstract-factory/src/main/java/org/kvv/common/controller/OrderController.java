package org.kvv.common.controller;

import org.kvv.beer.Beer;
import org.kvv.common.service.OrderService;
import org.kvv.snack.Snack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService<Beer> beerOrderService;

    @Autowired
    private OrderService<Snack> snackOrderService;

    @PostMapping("/beer")
    public ResponseEntity<String> beer(@RequestBody String product) {
        final var status = beerOrderService.process(product);
        return ResponseEntity.ok().body(status);

    }

    @PostMapping("/snack")
    public ResponseEntity<String> snack(@RequestBody String product) {
        final var status = snackOrderService.process(product);
        return ResponseEntity.ok().body(status);

    }

}
