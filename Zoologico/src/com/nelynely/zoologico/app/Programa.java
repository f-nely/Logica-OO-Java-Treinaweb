package com.nelynely.zoologico.app;

import com.nelynely.zoologico.classes.Animal;

public class Programa {

	public static void main(String[] args) {
		
		Animal dog = new Animal();
		
		dog.setName("Totó");
		dog.setAge(2);
		dog.setSpecies("dog");
		System.out.println("Hey, the animal is " + dog.getSpecies() + " its name is " + dog.getName() + " and its age is " + dog.getAge() +
		" years old");
		
		if (dog.ehAdulto()) {
			System.out.println("Animal is adult: ");
		} else {
			System.out.println("Animal isn't adult:: ");
		}

	}

}
