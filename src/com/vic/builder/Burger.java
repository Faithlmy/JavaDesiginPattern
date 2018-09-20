package com.vic.builder;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();// 为什么会返回Wrapper
	}
	
	@Override
	public abstract float price();
}
