package com.test.rg;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1=scanner.nextLine();
		System.out.println("Enter the Second string: ");
		String str2=scanner.nextLine();

		// Remove spaces and convert strings to lowercase
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// If lengths are not equal, they cannot be anagrams
		if (str1.length() != str2.length()) {
			System.out.println("If lengths are not equal, they cannot be anagrams");
		}
		// Convert strings to character arrays
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		// Sort both character arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		// Compare sorted arrays
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
		scanner.close();
	}
}
//string input>>lowercase>>length check>>toCharArray>>Arrays sort>>Arrays equal