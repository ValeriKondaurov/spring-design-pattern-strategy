package org.kvv.snack;

import org.kvv.snack.enums.SnackType;
import org.springframework.stereotype.Component;

@Component
public class Crackers implements Snack {

    @Override
    public String info() {
        return "Ordered crackers";
    }

    @Override
    public String label() {
        return SnackType.CRACKERS.name();
    }

}
