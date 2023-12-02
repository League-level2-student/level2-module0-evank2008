package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] Horsemen = {"Death", "Plague", "Pestilence", "War", "Famine"};
		//2. print the third element in the array
		System.out.println(Horsemen[2]);
		//3. set the third element to a different value
		Horsemen[2]="Stinkypoo";
		//4. print the third element again
		System.out.println(Horsemen[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0;i<5;i++) {
			System.out.println(Horsemen[i]);
		}
		
		//6. make an array of 50 integers
		int[] fifdy = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for(int i = 0; i<50;i++) {
			fifdy[i]=ran.nextInt(100);
		}
		
		int smalst=100;
		//8. without printing the entire array, print only the smallest number in the array
		for(int i = 0; i<50;i++) {
			if(smalst>fifdy[i]) {
				smalst = fifdy[i];
			}
		}
		System.out.println("The smallest number was " + smalst);
		//9 print the entire array to see if step 8 was correct
		System.out.println("The goblins will now list all numbers in the array.");
		for(int i = 0; i<50;i++) {
			System.out.println(fifdy[i]);
		}
		//10. print the largest number in the array.
		int bigst = -1;
		for(int i = 0; i<50;i++) {
			if(bigst<fifdy[i]) {
				bigst = fifdy[i];
			}
		}
		System.out.println("The biggest number was " + bigst);
	}
}
