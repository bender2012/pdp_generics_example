package com.epam.pdp.generics;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();

		zoo.addAnimal(new Cat("Felix"));
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat("cat_1"));
		catList.add(new Cat("cat_2"));
		zoo.addAnimalsExtends(catList);

		List<Animal> animalsList = new ArrayList<Animal>();
		animalsList.add(new Animal());
		animalsList.add(new Animal());

		zoo.addAnimalListSuper(animalsList);
		zoo.addAnimalsExtends(animalsList);

	}

}
