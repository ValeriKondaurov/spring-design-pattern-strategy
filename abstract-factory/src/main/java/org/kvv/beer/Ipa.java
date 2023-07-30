package org.kvv.beer;

import org.kvv.beer.enums.BeerType;
import org.springframework.stereotype.Component;

@Component
public class Ipa implements Beer{

	@Override
	public String info() {
		return "Ordered ipa beer";
	}

	@Override
	public String label() {
		return BeerType.IPA.name();
	}

}
