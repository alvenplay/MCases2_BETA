package me.Pawel.MineCases;

import java.util.Random;

public class RandGenerator {
	int Rand(int min, int max) {
	    Random rand = new Random();
	    int randomNumber = min + rand.nextInt(max - min + 1);;
	    return randomNumber;
	}	
}