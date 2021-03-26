package com.yjs3509.main;


class Base{
	
	private void f() {
		System.out.println("Base.private.f()");
	}
	
	public static void run() {
		Base base = new SubType();
		base.f();
	}
	
}


class SubType extends Base {
	
	public void f() {
		System.out.println("SubType.public.f()");
		
	}
	
}



public class DriverOverriding {
	public static void main(String[] args) {
		Base.run();
	}
	
}
