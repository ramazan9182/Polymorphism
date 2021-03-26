package com.yjs3509.util;

import java.util.Random;

import com.yjs3509.domain.Shape;
import com.yjs3509.domain.Square;
import com.yjs3509.domain.Triangle;

public class RandomShapeGenerator {

	private Random random = new Random();
	
	public Shape generate() {
		Shape shape = null;
		switch (random.nextInt(2)) {
		case 0:
			shape = new Triangle();
			break;
		case 1:
			shape = new Square();
			break;
		}
		return shape;
	}
	
}
