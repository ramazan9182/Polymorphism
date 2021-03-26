package com.yjs3509.covariantReturnTypes.domain;

/**
 * Covariant- return-types 
 * 
 * JAVASE5 Feature
 */

public class PersonService extends Service{
	
	@Override
	public B process() {
		return new B();
	}
	
}
