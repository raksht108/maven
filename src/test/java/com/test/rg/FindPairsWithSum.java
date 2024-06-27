package com.test.rg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPairsWithSum {

    public static List<List<Integer>> findPairsWithSum(List<Integer> nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int complement = targetSum - num;
            if (map.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(complement);
                result.add(pair);
            }
            map.put(num, num);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(3);
        nums.add(6);
        nums.add(1);
        nums.add(7);
        nums.add(5);
        int targetSum = 8;

        List<List<Integer>> pairs = findPairsWithSum(nums, targetSum);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Pairs with sum " + targetSum + ":");
            for (List<Integer> pair : pairs) {
                System.out.println(pair.get(0) + ", " + pair.get(1));
            }
        }
    }
}
