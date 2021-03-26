package com.yjs3509.main;

import com.yjs3509.domain.Shape;
import com.yjs3509.domain.Square;
import com.yjs3509.domain.Triangle;

public class DriverShapeUpcasting {

	/**
	 * 
	 * Dynamic Binding - Runtime Binding -> Dynamic method call
	 * 
	 */
	
	 
	
	public static void drawShape(Shape shape) {
		shape.draw(); // polymorphic call
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		drawShape(new Triangle());
		
//		drawShape(new Square());
		
	    Shape shape = new Triangle(); // upcasting
		
	    Triangle triangle = (Triangle)shape; // downcasting // --> may throw ClassCastException
	    
	    triangle.triangleSpecificMethod();
	    
//	    Triangle triangle = new Triangle();
	    
//	    triangle.triangleSpecificMethod();

	    
		
	}
}
