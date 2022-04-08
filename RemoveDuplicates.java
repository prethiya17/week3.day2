package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		// TODO Auto-generated method stub
		//a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		//Initialize an integer variable as count
		int count = 0;
		//Split the String into array
		String[] a=text.split(" ");
		
		//Iterate over the Loop
		for(int i=0;i<a.length;i++)
		{
			// Initialize another loop to check whether the word is there in the array
			for(int j=i+1;j<a.length;j++)
			{
				//System.out.println(i);
				//Check for records in both the array and replace with empty string
				if(a[i].equalsIgnoreCase(a[j])) {
					a[j]="";
				}
			}
		}
		//Display only the String without duplicates
		System.out.println("String without duplicates");
				for (int i = 0; i< a.length; i++) {
		            System.out.print(a[i] +" " );
		        }
		
		}
		
		
		
	}


