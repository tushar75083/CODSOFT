package com.codsoft;


import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	
	private static final int MIN_Range = 1;
	private static final int MAX_Range = 100;
	private static final int MAX_Attempts = 10;
	private static final int MAX_Rounds = 5;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int totalScore = 0;
		
		System.out.println("Welcome to Number Guessing Game.......");
		System.out.println("Total Number of Rounds : 5");
		System.out.println("Attempts to guess number in each round : 10");
		
		//number of rounds block
		for(int i=1; i<= MAX_Rounds; i++)
		{
			 int number = random.nextInt(MAX_Range)+ MIN_Range;
			 int attempts = 0;
			 
			 System.out.println("Round " + i + ": Guess the number between "+MIN_Range+" and "+MAX_Range+ " in "+MAX_Attempts+" attempts");
			 
			 //number of attempts block
			 while(attempts<MAX_Attempts)
			 {
				 System.out.println("Enter your guessed number :");
				 int guess_Number = sc.nextInt();
				 attempts = attempts + 1;
				 
				 if(guess_Number == number)
				 {
					 int score = MAX_Attempts - attempts;
					 totalScore = totalScore + score;
					 System.out.println("Number Guessed Successfully !!!!!! ");
					 System.out.println("Total attempts : "+attempts);
					 System.out.println("Round Score = "+score);
					 break;
				 }
				 
				 else if(guess_Number < number)
				 {
					 System.out.println("The number is greater than "+guess_Number + "...");
					 System.out.println("Attempts left = "+( MAX_Attempts - attempts));
				 }
				 
				 else if(guess_Number > number)
				 {
					System.out.println("The number is less than "+guess_Number + "..");
					System.out.println("Attempts left = "+(MAX_Attempts - attempts));
				 }
			 }
			 
			 if(attempts == MAX_Attempts)
			 {
				 System.out.println("Round : "+i);
				 System.out.println("Attempts : 0");
				 System.out.println("Round Score = 0");
				 System.out.println("The Random Number is "+number);
			 }
		}
		
		System.out.println("Game Over.......");
		System.out.println("Your Total Score = "+totalScore);
		System.out.println("Thank you very much for playing this game...");
		
		sc.close();
	}

}
