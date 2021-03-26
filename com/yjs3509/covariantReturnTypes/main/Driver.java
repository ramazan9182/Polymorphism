package com.yjs3509.covariantReturnTypes.main;

import com.yjs3509.covariantReturnTypes.domain.A;
import com.yjs3509.covariantReturnTypes.domain.B;
import com.yjs3509.covariantReturnTypes.domain.PersonService;
import com.yjs3509.covariantReturnTypes.domain.Service;

public class Driver {

	
	public static void main(String[] args) {
		
		Service service = new Service();
		PersonService personService = new PersonService();
		
		// System.out.println(service.process().getMessage());
		// System.out.println(personService.process().getMessage());
		
		A a = service.process();
		B b = personService.process();
		
		System.out.println(a.getMessage());
		System.out.println(b.getMessage());
		
	}
}
