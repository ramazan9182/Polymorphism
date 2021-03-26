package com.yjs3509.domain;

public class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	
	public void triangleSpecificMethod() {
		System.out.println("triangleSpecificMethod");
	}
}
