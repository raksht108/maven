package com.test.rg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumber {

	public static void main(String[] args){
        // Example list with duplicates
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        System.out.println(numbers);
        
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set=new HashSet<Integer>();
        
        for (int n:numbers)
        {
        	if(!set.add(n)) {
        		duplicates.add(n);
        		
        	}
        }
        System.out.println(duplicates);

        // Find duplicates
        //List<Integer> duplicates = findDuplicates(numbers);

        // Print duplicates
        System.out.println("Duplicate numbers in the list: " + duplicates);
    }

}
