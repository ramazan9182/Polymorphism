package com.yjs3509.domain;

public class GraphicUserInterfaceComponent extends Component{
	
	private A a = new A();
	
	static {
		System.out.println("GraphicUserInterfaceComponent.static.block");
	}

	public GraphicUserInterfaceComponent() {
		System.out.println("Before component draw");
		drawToScreen(); // polymorphic call BE CAREFULL !!!
		System.out.println("After component draw");
	}
	
	public void drawToScreen() {
		System.out.println("GraphicUserInterfaceComponent.drawToScreen");
	}
	
}
