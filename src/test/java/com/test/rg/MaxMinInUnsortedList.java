package com.test.rg;

import java.util.ArrayList;
import java.util.List;

public class MaxMinInUnsortedList {

    public static void findMaxMin(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static void main(String[] args) {
        // Example list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);

        // Find max and min
        findMaxMin(numbers);
    }
}