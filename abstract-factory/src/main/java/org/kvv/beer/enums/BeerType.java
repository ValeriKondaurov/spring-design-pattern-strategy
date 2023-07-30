package org.kvv.beer.enums;

import org.kvv.beer.Ale;
import org.kvv.beer.Beer;
import org.kvv.beer.Ipa;
import org.kvv.beer.Stout;

import java.util.Arrays;

public enum BeerType {
	
	ALE("Ale", Ale.class),
	IPA("Ipa", Ipa.class),
	STOUT("Stout", Stout.class);
	
	private String name;
	private Class<? extends Beer> type;
	
	BeerType(String name, Class<? extends Beer> type){
		this.name = name;
		this.type = type;
	}
	
    public static BeerType of(String value) {

        return Arrays.stream(values()).filter(type -> type.name.equalsIgnoreCase(value)).findFirst().orElse(null);
    }
	
	public String getName() {
		return name;
	}
	
	public Class<? extends Beer> getType(){
		return type;
	}

}
