//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		String[] kindness = {"you are kind","you are kinding","you are very very kind", "You are kind kind kind","you kind"};
		for(int i =0; i<10; i++) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		System.out.println(kindness[randomNumber]);

		// 2. Repeat all the code above 10 times
		}
		// 3. Find someone to test out your program. They will like it :)
	}
}
