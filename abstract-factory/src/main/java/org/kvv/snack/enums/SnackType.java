package org.kvv.snack.enums;

import org.kvv.snack.Fish;
import org.kvv.snack.Snack;
import org.kvv.snack.Chips;
import org.kvv.snack.Crackers;

import java.util.Arrays;

public enum SnackType {
	
	FISH("Fish", Fish.class),
	CHIPS("Chips", Chips.class),
	CRACKERS("Crackers", Crackers.class);
	
	private String name;
	private Class<? extends Snack> type;
	
	SnackType(String name, Class<? extends Snack> type){
		this.name = name;
		this.type = type;
	}
	
    public static SnackType of(String value) {

        return Arrays.stream(values()).filter(type -> type.name.equalsIgnoreCase(value)).findFirst().orElse(null);
    }
	
	public String getName() {
		return name;
	}
	
	public Class<? extends Snack> getType(){
		return type;
	}

}
