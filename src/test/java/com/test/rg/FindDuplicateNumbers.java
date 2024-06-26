package com.test.rg;

import java.util.*;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Adding a duplicate
        numbers.add(4);
        numbers.add(1); // Adding another duplicate
       
        Set<Integer> set = new TreeSet(numbers);
        System.out.println(numbers);

        List<Integer> duplicates = findDuplicates(numbers);

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }
    }

    /**
     * Method to find duplicate numbers in a list of integers.
     *
     * @param numbers The list of integers to check
     * @return A list containing duplicate integers found in the input list
     */
    public static List<Integer> findDuplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (Integer number : numbers) {
            if (!set.add(number)) {
                // If set.add(number) returns false, it means the number is already in the set (duplicate)
                duplicates.add(number);
            }
        }

        return duplicates;
    }
}
