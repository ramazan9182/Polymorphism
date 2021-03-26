package com.yjs3509.domain;

public class Component {
	
	private C c = new C();
	
	static {
		System.out.println("Component.static");
	}

	public Component() {
		System.out.println("Component");
	}
	
}
