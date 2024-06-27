package com.test.rg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {
    
    public static List<Integer> removeDuplicates(List<Integer> listWithDuplicates) {
        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>(listWithDuplicates);
        
        // Create a new ArrayList to store elements without duplicates
        List<Integer> listWithoutDuplicates = new ArrayList<>(set);
        
        return listWithoutDuplicates;
    }
    
    public static void main(String[] args) {
        // Example list with duplicates
        List<Integer> numbersWithDuplicates = new ArrayList<>();
        numbersWithDuplicates.add(5);
        numbersWithDuplicates.add(2);
        numbersWithDuplicates.add(7);
        numbersWithDuplicates.add(2);
        numbersWithDuplicates.add(8);
        numbersWithDuplicates.add(5);
        
        // Remove duplicates
        List<Integer> numbersWithoutDuplicates = removeDuplicates(numbersWithDuplicates);
        
        // Print the list without duplicates
        System.out.println("Original List with Duplicates: " + numbersWithDuplicates);
        System.out.println("List without Duplicates: " + numbersWithoutDuplicates);
    }
}