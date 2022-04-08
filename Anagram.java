package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		// Declare a String 
		String text1 = "stops";
	   //Declare another String
		String text2 = "potss";
		//Check length of the strings are same then (Use A Condition)
		if(text1.length()== text2.length()) {
			System.out.println("Length are same:"+" "+text1.length());
		}
		else
		{
			System.out.println("Lengths are not same");
		}
		
		//Convert both the String into Array
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		//Sort both the Arrays and print it
		Arrays.sort(charArray);
		System.out.println(charArray);
		Arrays.sort(charArray2);
		System.out.println(charArray2);
		//Check if both the Arrays are same and print it if it is same
		if(Arrays.equals(charArray, charArray2))
		{
			//Print if both the Arrays are same
			System.out.println("Anagram");
		}
		else {
			//Print if both the Arrays are different
			System.out.println("Bot a Anagram");
		}
				}
		
	}

