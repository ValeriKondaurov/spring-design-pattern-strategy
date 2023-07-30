package org.kvv.beer;

import org.kvv.beer.enums.BeerType;
import org.springframework.stereotype.Component;

@Component
public class Ale implements Beer{

	@Override
	public String info() {
		return  "Ordered ale beer";
	}

	@Override
	public String label() {
		return BeerType.ALE.name();
	}

}
