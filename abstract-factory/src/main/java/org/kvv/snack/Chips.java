package org.kvv.snack;

import org.kvv.snack.enums.SnackType;
import org.springframework.stereotype.Component;

@Component
public class Chips implements Snack {

	@Override
	public String info() {
		return "Ordered chips";
	}

	@Override
	public String label() {
		return SnackType.CHIPS.name();
	}

}
