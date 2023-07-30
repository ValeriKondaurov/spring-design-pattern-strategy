package org.kvv.beer.factory;

import org.kvv.beer.Beer;
import org.kvv.beer.enums.BeerType;
import org.kvv.common.factory.AbstractFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeer implements AbstractFactory<Beer> {
	
	@Autowired
	private ApplicationContext context;

	@Override
	public Beer create(String type) {
		
		return context.getBean(BeerType.of(type).getType());
	}

}
