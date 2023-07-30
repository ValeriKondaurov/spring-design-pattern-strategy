package org.kvv.snack.factory;

import org.kvv.common.factory.AbstractFactory;
import org.kvv.snack.Snack;
import org.kvv.snack.enums.SnackType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FactorySnack implements AbstractFactory<Snack> {
	
	@Autowired
	private ApplicationContext context;

	@Override
	public Snack create(String type) {
		
		return context.getBean(SnackType.of(type).getType());
	}

}
