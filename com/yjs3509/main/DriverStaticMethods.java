package com.yjs3509.main;


class BaseB{
	
	public static String getMessage() {
		return "BaseB.static.getMessage()";
	}
	
	public String getOtherMessage() {
		return "BaseB.getOtherMessage()";
	}
	
}


class SubB extends BaseB{
	
	public static String getMessage() {
		return "SubB.static.getMessage()";
	}
	
	public String getOtherMessage() {
		return "SubB.getOtherMessage()";
	}
	
}

public class DriverStaticMethods {

	public static void main(String[] args) {
		
		BaseB base = new SubB();
		System.out.println(base.getMessage()); // there is no polymorphic call because it is STATIC !!!
		System.out.println(base.getOtherMessage()); //dynamic call --> polymorphic call
	}
}
