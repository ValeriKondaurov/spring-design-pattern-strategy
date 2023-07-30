package org.kvv.snack;

import org.kvv.snack.enums.SnackType;
import org.springframework.stereotype.Component;

@Component
public class Fish implements Snack {

	@Override
	public String info() {
		return  "Ordered Fish";
	}

	@Override
	public String label() {
		return SnackType.FISH.name();
	}

}
