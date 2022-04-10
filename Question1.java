package dsHW;
import java.util.Scanner;
public class Question1 {

	public static void sol(int[] arr1, int n1, int[] arr2, int n2) {
		int x;
		int y;
		int a = 0;
		//we try to make an array of maximum elements that would be length of arr1 and arr2
		int[] arr3 = new int[n1 + n2];
	    //for loop to itrate through arr1
		for(int i = 0; i < n1; i++) {
			x = arr1[i];
			// it store every element of arr1 in x 
			//this for loop itrates through arr2
			for(int j = 0; j < n2; j++) {
				//y store every element in arr2
				y = arr2[j];
				//if element arr1 is equal to any element of arr2 it gets stored in arr3 using this if
				if(x == y) {
					arr3[a] = x;
					//we increment a to keep track of number of element stored in  arr3
					a++;
					
				}
				
			}
		
		}
		//we use this method to remover any element that are repeated in arr3
		int c = removingExtra(arr3, a);
		//this method prints all the element in arr3 which is our answer
		print(arr3, c);
		
	}
	public static int removingExtra(int[] x, int a) {
		//method to return remove repeated elements from arrays
		 if (a == 0 || a == 1)
	            return a;
	      
	        // To store index of next unique element
	        int j = 0;
	      
	        // Doing same as done in Method 1
	        // Just maintaining another updated index i.e. j
	        for(int i = 0; i < a; i++) {
	        	if(x[i] != x[i+1]) {
	        		x[j] = x[i];
	        		j++;
	        	}
	        	
	        }
	        x[j] = x[a];
        	return j;
	}
	public static void print(int[] x, int a) {
		//this for loop prints all the element in arr3
		for(int i = 0; i < a; i++) {
			System.out.println(x[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//to take user input of array
		System.out.println("Enter number of element in first Array: ");
		int n1 = sc.nextInt();
		//n1 tracks no. of element in arr1
		// number of element in arr1
		int[] arr1 = new int[n1];
		// array to get input for each element in an array
		for(int i = 0; i < n1; i++) {
			System.out.print("Enter " + i + "th element of array in sorted order:  ");
			int x = sc.nextInt();
			arr1[i] = x;
			System.out.println("");
		}
		System.out.println("Enter the number of element in second Array in sorted order: ");
		// now enter number of element in arry 2
		int n2 = sc.nextInt();
		// n2 keep trake of number of element in arr2
		int[] arr2 = new int[n2];
		// for loop to take input for arr2
		for(int j = 0; j < n2; j++) {
			System.out.print("Enter " + j + "th element of array: ");
			int y = sc.nextInt();
			arr2[j] = y;
			System.out.println("");
		}
        // to mearge element of arr1 and arr2 which are common
		sol(arr1, arr1.length, arr2, arr2.length);
		
	}

}
