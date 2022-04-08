package week3.day2.assignments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// 
		
		int[] arr = {1,2,3,4,7,6,8};
		//Declare the List for the Integer Array
				List<Integer> l=new LinkedList<Integer>();
				
				//Pass the Array and add into LinkedList
				for(int i=0;i<arr.length;i++) {
					l.add(arr[i]);
				}
				//Print the Added List from above Line
				System.out.println(l);
				//Sort the List and print the Sorted List
				Collections.sort(l);
				System.out.println(l);
				
				//Iterate through the Loop to find the Missing Number
				for(int i=l.get(0);i<l.size();i++) {
					//check if the iterator variable is not equal to the array values respectively 
					if(i!=l.get(i-1)) {
						// print the number
						System.out.println("Missing Element in this Array:"+i);
						//once printed break the iteration
						break;
					}
				}
				


	}

}
