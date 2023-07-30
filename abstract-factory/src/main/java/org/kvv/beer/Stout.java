package org.kvv.beer;

import org.kvv.beer.enums.BeerType;
import org.springframework.stereotype.Component;

@Component
public class Stout implements Beer {

    @Override
    public String info() {
        return "Ordered stout beer";
    }

    @Override
    public String label() {
        return BeerType.STOUT.name();
    }

}
