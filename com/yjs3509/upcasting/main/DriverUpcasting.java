package com.yjs3509.upcasting.main;

import com.yjs3509.upcasting.domain.Person;
import com.yjs3509.upcasting.domain.Student;

public class DriverUpcasting {
	
	public static void main(String[] args) {
		
		//Student student = new Student();
		
		// Upcasting
		Person person;
		person=new Student();
		person.f();
		
		
	}

}
