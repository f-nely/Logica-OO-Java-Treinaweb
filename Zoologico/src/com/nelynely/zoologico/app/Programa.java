package com.nelynely.zoologico.app;

import com.nelynely.zoologico.classes.Cat;
import com.nelynely.zoologico.classes.Dog;

public class Programa {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Totó");
		dog.setSpecies("dog");
		dog.setAge(2);
		
		Cat cat = new Cat("Steve", 2);
		
		System.out.println("Hey, the animal is " + dog.getSpecies() + " its name is " + dog.getName() + " and its age is " + dog.getAge() +
		" years old");
		
		if (dog.ehAdulto()) {
			System.out.println("Dog is adult: ");
		} else {
			System.out.println("Dog isn't adult: ");
		}
		dog.emitirBarulho();
		
		System.out.println("\nHey, the animal is " + cat.getSpecies() + " its name is " + cat.getName() + " and its age is " + cat.getAge() +
				" years old");
				
		if (cat.ehAdulto()) {
			System.out.println("Cat is adult: ");
		} else {
			System.out.println("Cat isn't adult: ");
		}
		cat.emitirBarulho();

	}

}
