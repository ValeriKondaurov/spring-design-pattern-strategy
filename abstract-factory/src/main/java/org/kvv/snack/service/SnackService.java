package org.kvv.snack.service;

import org.kvv.common.factory.AbstractFactory;
import org.kvv.common.service.OrderService;
import org.kvv.snack.Snack;
import org.springframework.stereotype.Service;

@Service
public class SnackService extends OrderService<Snack> {

    public SnackService(AbstractFactory<Snack> factory) {
        super(factory);
    }
}
