package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInArrayWithList {

	public static void main(String[] args) {
		// initialize the array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		
		//Initialize both Set and List for storing and processing  
		Set<Integer> result=new HashSet<Integer>();
		List<Integer> dup=new ArrayList<Integer>();
		//Add the Array into the List
		for(int i=0;i<arr.length;i++) {
			dup.add(arr[i]);
		}
        //Iterate through the Loop for Comparison
		for(int i=0;i<dup.size();i++) {
			count=0;
			//Iterate another Inner loop for Comparing with Outer Loop
			for(int j=0;j<dup.size();j++) {
				if(dup.get(i)== dup.get(j)) 
					count++;
				}
		//If result count is more than one,add it to the Set to find duplicate
				if(count>1) 
					result.add(dup.get(i));
					//break;
		}	
		//Print the result set
				System.out.println(result);
		
	}

}
