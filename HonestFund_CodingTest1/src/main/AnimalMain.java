package main;

import java.util.Random;

import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Dolphin;
import animal.GoldFish;
import animal.Parrot;
import animal.Tiger;

public class AnimalMain {
	public static void main(String[] args) {
		Animal[] animals = new Animal[6];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Dolphin();
		animals[3] = new GoldFish();
		animals[4] = new Parrot();
		animals[5] = new Tiger();
		
		Random random = new Random();
		
		for(int i = 0; i < 5; i++){
			if(i == 4) animals[4 - i].cry();
			animals[random.nextInt(5)].cry();
		}
	}
}
