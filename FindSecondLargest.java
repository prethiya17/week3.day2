package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// 
		//Initialize the Array
		int[] data = {3,2,11,4,6,7};
		//Initialize the Size as 0
		int size=0;
		//Declare the List for the Integer Array
		List<Integer> l=new LinkedList<Integer>();
		
		//Pass the Array and add into LinkedList
		for(int i=0;i<data.length;i++) {
			l.add(data[i]);
		}
		//Print the Added List from above Line
		System.out.println(l);
		
		//Sort the Collection List and print the sorted List
		Collections.sort(l);
		System.out.println(l);
		
		//Finding the Second largest index and assigning to Size variable.
		size=l.size();
		size=size-2;
		
		//Print the Second Largest Number
		System.out.println("The Second Largest Number is:"+ l.get(size));
	}

}
