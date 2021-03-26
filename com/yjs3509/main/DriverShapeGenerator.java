package com.yjs3509.main;

import com.yjs3509.util.RandomShapeGenerator;

public class DriverShapeGenerator {

	
	public static void main(String[] args) {
		RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();
		for(int i = 0; i < 5; i++) {
			randomShapeGenerator.generate().draw();
		}
	}
}
