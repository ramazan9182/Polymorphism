package com.yjs3509.main;

import com.yjs3509.domain.Square;
import com.yjs3509.domain.Triangle;

public class Driver {
	
	

	
	public static void drawShape(Triangle triangle) {
		triangle.draw();
	}
	
	public static void drawShape(Square square) {
		square.draw();
	}
	
	public static void main(String[] args) {
		
		drawShape(new Triangle());
		drawShape(new Square());
		
	}
}
