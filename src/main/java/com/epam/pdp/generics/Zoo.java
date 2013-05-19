package com.epam.pdp.generics;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<? super Animal> animalsSuper;
	private List<? extends Animal> animals;

	public void addAnimal(Animal animal) {
		if (animalsSuper == null) {
			animalsSuper = new ArrayList<Animal>();
		}
		animalsSuper.add(animal);
		Animal an = (Animal) animalsSuper.get(animalsSuper.size() - 1);
		System.out.println("Added " + an.getName());
	}

	public void addAnimalListSuper(List<? super Animal> animals) {
		animalsSuper = animals;
	}

	public void addAnimalsExtends(List<? extends Animal> animals) {
		this.animals = animals;

	}

}
