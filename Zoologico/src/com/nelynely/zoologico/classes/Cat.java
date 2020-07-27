package com.nelynely.zoologico.classes;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		
	}
	
	public Cat(String name, String species, int age) {
		super(name, species, age);
	}
	
	public Cat(String name, int age) {
		super(name,"cat", age);
	}

}
