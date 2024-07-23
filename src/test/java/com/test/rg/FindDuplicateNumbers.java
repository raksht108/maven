package com.test.rg;

import java.util.*;

public class FindDuplicateNumbers 
{
	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		System.out.println("Duplicate elements in given array: ");  
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) 
		{

			if (arr[i]==arr[i+1]) 
			{
				System.out.println("duplicate numbers are "+arr[i+1] );
			}
		}
	}
}


