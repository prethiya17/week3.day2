package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// Initialize the value in two arrays
		int[] a= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		
		//Initialize the array into the List
		List<Integer> aa=new ArrayList<Integer>();
		List<Integer> bb=new ArrayList<Integer>();
		List<Integer> result=new ArrayList<Integer>();
		
		//Iterate through the Array and add both the array into List
		for(int i=0;i<a.length;i++) {
			aa.add(a[i]);
		}
			for(int j=0;j<a.length;j++) {
				bb.add(b[j]);
			}
			//Iterate through First array
			for(int i=0;i<aa.size();i++) {
			//Iterate through second Array
				for(int j=0;j<bb.size();j++) {
		//Check for data condition,if it matches thenwhile loop gets executed
					while(aa.get(i)==bb.get(j))
							{
	    //Add the List into the Result List to print the values as an array
					result.add(aa.get(i));
						break;	
				}
				
			}
										
				}
			System.out.println(result);

	}

}
