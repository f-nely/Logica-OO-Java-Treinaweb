package com.nelynely.zoologico.classes;

public class Animal {
	
	private String name;
	private String species;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void emitirBarulho() {
		System.out.println("Barulho do animal: ");
	}
	
	

}
