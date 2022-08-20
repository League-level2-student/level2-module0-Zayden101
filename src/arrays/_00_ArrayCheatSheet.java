package arrays;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		
		 int smallestNumber = 100;
		 int biggestNumber = 0;


//		 i == 0 ? smallestNumber = myString[0] : smallest = 0;
//            ? = if                       : = else
		 
		 
		 
		
		//1. make an array of 5 Strings
		
//		String[] otherStrings = new String[3];
//		otherStrings[0] = "one";
//		otherStrings[1] = "two";
//		otherStrings[2] = "three";
		
		String[] myString = {"one","two","three","four","five"};
		

		
		//2. print the third element in the array
		
		System.out.println(myString[2]);
		
		//3. set the third element to a different value
		
		myString[2] = "six";
		
		//4. print the third element again
		
		System.out.println(myString[2]);
		
		System.out.println( );

		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for (int i = 0; i < myString.length; i++) {
			System.out.println(myString[i]);
		}
		
		//6. make an array of 50 integers
		
		int array[] = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		
		for (int i = 0; i<array.length; i++) {
			Random rand = new Random();
			array[i] = rand.nextInt(100);
		}
		
		System.out.println( );
		//8. without printing the entire array, print only the smallest number in the array
				

		
		for (int i = 0; i<array.length; i++) {
			if(i==0) {
				smallestNumber = array[i];
			}
			if (array[i] < smallestNumber) {
				smallestNumber = array[i];
			}
		}
		
		System.out.println(smallestNumber + " = Smallest");
		
		//9 print the entire array to see if step 8 was correct
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//10. print the largest number in the array.
		
		
		for (int i = 0; i<array.length; i++) {
			if(i==0) {
				biggestNumber = array[i];
			}
			if (array[i] > biggestNumber) {
				biggestNumber = array[i];
			}
		}
		
		System.out.println(biggestNumber + " = Biggest");
		
	}
}
