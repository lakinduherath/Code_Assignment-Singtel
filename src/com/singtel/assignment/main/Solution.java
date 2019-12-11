package com.singtel.assignment.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.Bird;
import com.singtel.assignment.model.Butterfly;
import com.singtel.assignment.model.Cat;
import com.singtel.assignment.model.Chicken;
import com.singtel.assignment.model.ClownFish;
import com.singtel.assignment.model.Dog;
import com.singtel.assignment.model.Dolphin;
import com.singtel.assignment.model.Duck;
import com.singtel.assignment.model.Fish;
import com.singtel.assignment.model.Frog;
import com.singtel.assignment.model.Parrot;
import com.singtel.assignment.model.Rooster;
import com.singtel.assignment.model.Shark;
import com.singtel.assignment.model.features.Flying;
import com.singtel.assignment.model.features.Singing;
import com.singtel.assignment.model.features.Swimming;
import com.singtel.assignment.model.features.Walking;

public class Solution {

	public static void main(String[] args) {
		/**
		Bird bird = new Bird();
		
		System.out.println(bird.walk());
		System.out.println(bird.fly());
		System.out.println(bird.sing());
		**/
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(new Dog()),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
				};

		List<String> flyingAnimals = Arrays.stream(animals)
				.filter(a -> a instanceof Flying)
				.map(a -> a.getClass().getSimpleName())
				.collect(Collectors.toList());

		List<String> walkingAnimals = Arrays.stream(animals)
				.filter(a -> a instanceof Walking)
				.map(a -> a.getClass().getSimpleName())
				.collect(Collectors.toList());

		List<String> singingAnimals = Arrays.stream(animals)
				.filter(a -> a instanceof Singing)
				.map(a -> a.getClass().getSimpleName())
				.collect(Collectors.toList());

		List<String> swimmingAnimals = Arrays.stream(animals)
				.filter(a -> a instanceof Swimming)
				.map(a -> a.getClass().getSimpleName())
				.collect(Collectors.toList());

		System.out.println("Counts:");
		System.out.println("\tFlying Animals	: " + flyingAnimals.size());
		System.out.println("\tWalking Animals	: " + walkingAnimals.size());
		System.out.println("\tSinging Animals	: " + singingAnimals.size());
		System.out.println("\tSwimming Animals: " + swimmingAnimals.size());
	}

}
