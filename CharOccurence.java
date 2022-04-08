package week3.day2.assignments;

public class CharOccurence {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
		//Declare the String
		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int occ=0;
		// convert the string into char array
		char[] c = str.toCharArray();
			
		//get the length of the array
		int l = c.length;
			
		// traverse from 0 till the array length 
		for(int i=0;i<l;i++) {
			// Check the char array has the particular char in it 
			if(c[i]=='e') {
				// if is has increment the count
				occ++;
			}
			}	
		// print the count out of the loop
					System.out.println("Number of Occurences:"+ occ);
	}

}
