package com.jspiders.singleton.bject;

public class SingletonEager {

	static SingletonEager object = new SingletonEager();
	
	private SingletonEager() {
		System.out.println("Constructor Accessed");
	}
	
	public static SingletonEager getObject() {
		System.out.println("Methdo Accessed");
		return object;
	}
}

