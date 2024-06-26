package com.test.rg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListContainsInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to find in the list: ");
		int n = scanner.nextInt();
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		if(list.contains(n)) {
			System.out.println("List contains " + n);
		}
		else {
			System.out.println("List does not contain " + n);
		}
	}

}
