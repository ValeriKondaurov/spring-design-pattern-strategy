package org.kvv.common.service;

import lombok.AllArgsConstructor;
import org.kvv.common.factory.AbstractFactory;
import org.kvv.common.type.Product;


@AllArgsConstructor
public abstract class OrderService<T extends Product> {

    protected final AbstractFactory<T> factory;

    public String process(String product) {
        T t = factory.create(product);
        return t.info();
    }
}
