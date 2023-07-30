package org.kvv.beer.service;

import org.kvv.beer.Beer;
import org.kvv.common.factory.AbstractFactory;
import org.kvv.common.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class BeerService extends OrderService<Beer> {

    public BeerService(AbstractFactory<Beer> factory) {
        super(factory);
    }
}
