package com.test.rg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateString {

	public static void main(String[] args){
        // Example list with duplicates
        List<String> numbers = new ArrayList<String>();
        numbers.add("Rakshith");
        numbers.add("Sangeetha");
        numbers.add("Rakshith");
        numbers.add("Sangeetha");
        numbers.add("Saanvi");
        numbers.add("Saanvi");
        System.out.println(numbers);
        
        List<String> duplicates = new ArrayList<>();
        Set<String> set=new HashSet<String>();
        
        for (String n:numbers)
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
