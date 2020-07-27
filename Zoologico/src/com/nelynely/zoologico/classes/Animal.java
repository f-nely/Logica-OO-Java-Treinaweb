package com.nelynely.zoologico.classes;

public abstract class Animal {

	private String name;
	private String species;
	private int age;

	public Animal(String name, String species, int age) {
		this.name = name;
		this.species = species;
		this.age = age;
	}
	
	public Animal(String name) {
		this.name = name;
	}

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

	public abstract void emitirBarulho();

	public Boolean ehAdulto() {

		return age >= 1;
	}

}
