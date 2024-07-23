package com.test.rg;

import java.util.ArrayList;
import java.util.List;

public class TestJava {public static void main(String[] args) {
	//civic, radar, level, rotor, kayak, madam, india, refer
	/*String[] str=new String[]{'civic', 'radar', 'level', 'rotor', 'kayak', 'madam', 'india', 'refer'}*/
	List<String> str=new ArrayList<String>();
	str.add("civic");
	str.add("radar");
	str.add("level");
	str.add("rotor");
	str.add("kayak");
	str.add("madam");
	str.add("india");
	str.add("refer");


	for(String n:str)
	{ 
		StringBuilder rak=new StringBuilder(n);
		String newText=rak.reverse().toString();		

		if(newText.equals(n))
		{ 
			System.out.println("Old String: "+rak+"\nReversed String: "+n+"\nString is Palindrome\n");
		} 
		else 
		{ 
			System.out.println("Old String: "+n+"\nReversed String: "+rak+"\nString is not palindrome\n"); 
		}

	}
}

}
