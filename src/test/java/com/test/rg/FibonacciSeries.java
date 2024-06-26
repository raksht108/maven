package com.test.rg;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of terms in Fibonacci series: ");
		int n = scanner.nextInt();

		System.out.println("Fibonacci Series:");
		int first = 0, second = 1;

		// Print the first two terms
		System.out.print(first + " " + second + " ");

		// Generate the Fibonacci series
		for (int i = 3; i <= n; i++) {
			int next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}
		scanner.close();
		System.out.println();
	}
}
