package com.yjs3509.domain;

public class Sandwich extends PortableLunch{

	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();
	public Sandwich() {
		System.out.println("Sandwich");
	}
	
}
