package com.test.rg;

public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        // Calculate the expected sum of numbers from 1 to 100
        int expectedSum = 100 * (100 + 1) / 2;

        // Calculate the actual sum of numbers in the given array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference between expected sum and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Create an array containing numbers from 1 to 100 with one missing number
        int[] numbers = new int[100];
        for (int i = 0; i < 99; i++) { // Fill array with numbers 1 to 99
            numbers[i] = i + 1;
        }
        // Skip number 50
        numbers[99] = 0; // Missing number

        // Find the missing number
        int missingNumber = findMissingNumber(numbers);

        System.out.println("The missing number is: " + missingNumber);
    }
}