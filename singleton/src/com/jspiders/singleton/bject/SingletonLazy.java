package com.jspiders.singleton.bject;


public class SingletonLazy {

	static SingletonLazy object;
	
	private SingletonLazy() {
		System.out.println("Constrcutor Accesed");
	}
	
	public static SingletonLazy getObject() {
		System.out.println("Method Accessed");
		
		if(object == null) {
			object = new  SingletonLazy();
		}
		return object;
	}
}
