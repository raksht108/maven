package com.test.rg;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String originalText = scanner.nextLine();
        StringBuilder input1 = new StringBuilder(originalText);
        String duplicate=input1.reverse().toString();
        System.out.println(originalText);
        System.out.println(duplicate);
        if (originalText.equals(duplicate))
        {
        	System.out.print("Palindrome");
        }
        else
        {
        	System.out.print("Not Palindrome");
        }        
        scanner.close();
    }
}

    // Function to check if a string is palindrome
	/*
	 * public static boolean isPalindrome(String str) { // Remove spaces and convert
	 * to lowercase (if needed) str = str.replaceAll("\\s+", "").toLowerCase();
	 * 
	 * int left = 0; int right = str.length() - 1;
	 * 
	 * while (left < right) { if (str.charAt(left) != str.charAt(right)) { return
	 * false; // Characters at symmetric positions do not match } left++; right--; }
	 * return true; // All characters matched } }
	 */
