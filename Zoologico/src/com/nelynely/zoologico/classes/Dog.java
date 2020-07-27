package com.nelynely.zoologico.classes;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		
	}
	
	public Dog(String name, String species, int age) {
		super(name, species, age);
	}
	
	public Dog(String name, int age) {
		super(name, "dog", age);
	}

	@Override
	public void emitirBarulho() {
		System.out.println("Latido do cachorro: ");
		
	}

}
