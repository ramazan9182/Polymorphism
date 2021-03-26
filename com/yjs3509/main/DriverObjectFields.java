package com.yjs3509.main;


class BaseA{
	
	public int value;
	
	public int getValue() {
		return value;
	}
}


class Sub extends BaseA{
	
	public int value = 1;
	
	public int getValue() {
		return value;
	}
	
	public int getSuperValue() {
		return super.value;
	}
	
}


public class DriverObjectFields {

	public static void main(String[] args) {
		BaseA base = new Sub(); // upcasting
		
		System.out.println(base.value);
		System.out.println(base.getValue()); // polymorphic call
		
		 Sub sub = new Sub();
		 System.out.println(sub.value);
		 System.out.println(sub.getValue());
		 System.out.println(sub.getSuperValue());
		
	}
}
