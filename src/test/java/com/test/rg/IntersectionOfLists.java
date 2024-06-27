package com.test.rg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfLists {

    public static List<Integer> computeIntersection(List<Integer> list1, List<Integer> list2) {
        // Use a HashSet to store elements of list1 for quick lookup
        Set<Integer> set = new HashSet<>(list1);
        
        // List to store intersection elements
        List<Integer> intersection = new ArrayList<>();
        
        // Iterate through list2 and add common elements to intersection list
        for (Integer num : list2) {
            if (set.contains(num)) {
                intersection.add(num);
                // Remove the element from set to handle duplicates
                set.remove(num);
            }
        }
        
        return intersection;
    }

    public static void main(String[] args) {
        // Example lists
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(5);

        // Compute intersection
        List<Integer> intersection = computeIntersection(list1, list2);

        // Print intersection
        System.out.println("Intersection of list1 and list2: " + intersection);
    }
}