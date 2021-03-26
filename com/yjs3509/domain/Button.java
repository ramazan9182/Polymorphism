package com.yjs3509.domain;

public class Button extends GraphicUserInterfaceComponent{

	private B b = new B();
	private int value = 11;
	
	static {
		System.out.println("Button.static.block");
	}
	
	public Button(int value) {
		this.value = value;
		System.out.println("Button.value " + this.value);
		
	}
	
	public void drawToScreen() {
		System.out.println("Button.drawToScreen " + this.value);
	}
}
