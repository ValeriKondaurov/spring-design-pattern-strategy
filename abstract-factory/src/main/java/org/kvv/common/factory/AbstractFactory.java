package org.kvv.common.factory;

public interface AbstractFactory<T> {
	
	T create(String type);

}
