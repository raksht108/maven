package com.test.rg;
import java.util.Scanner;

public class PrimeNumberFinder { 

	public static void main(String[] args) 
	{ 
		int i=2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check if it's prime:\n ");
		int number = scanner.nextInt();

		if (number <= 1) 
		{
			System.out.println("not prime");
		} 
		// Check from 2 to sqrt(number) for factors of number  
		else if (number % i == 0) 
		{ 
			System.out.println(number+" not a prime number");
			// Found a factor, hence not prime 
		}
		else {
			System.out.println(number+" is a prime number");
		}
		scanner.close(); 
	} 

}
