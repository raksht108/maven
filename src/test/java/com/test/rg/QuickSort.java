package com.test.rg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class QuickSort {

    public static void quickSort(List<Integer> nums, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivotIndex = partition(nums, low, high);

            // Recursively sort the sub-arrays
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    public static int partition(List<Integer> nums, int low, int high) {
        // Choose the pivot element (middle element)
        int pivot = nums.get(high);
        int i = low - 1;

        // Partitioning process
        for (int j = low; j < high; j++) {
            if (nums.get(j) < pivot) {
                i++;

                // Swap nums[i] and nums[j]
                int temp = nums.get(i);
                nums.set(i, nums.get(j));
                nums.set(j, temp);
            }
        }

        // Swap nums[i+1] and nums[high] (put pivot in the correct position)
        int temp = nums.get(i + 1);
        nums.set(i + 1, nums.get(high));
        nums.set(high, temp);

        return i + 1;
    }

    public static void main(String[] args) {
        // Example list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);

        // Perform quick sort
    //    quickSort(numbers, 0, numbers.size() - 1);
        Set<Integer> set=new TreeSet<Integer>(numbers);

        // Print sorted list
        System.out.println("Sorted list: " + set);
    }
}