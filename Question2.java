package dsHW;
import java.util.Scanner;
public class Question2 {

	public static void arr(int[] x, int a, int[] y, int b) {
		int p,q = 0;
		//element p stors element in x
		// q will keep count of number of elements stroed in arr1
		
		int[] arr1 = new int[a + b];
		for(int i = 0; i <= a; i++) {
			//this for loop gives value of element in array x to p;
			p = x[i];
			int low = 0;
			int high = b;
			//this is binary search which searches for common element in x and y
			while(low<=high) {
				int mid = (low+high)/2;
				// if element of x and y matches then they are stored in arr1
				if(y[mid] == p) {
					arr1[q] = p;
					// we increament q to keep track of number of element stroed in arr1
					q++;
					
					break;
					
				}
				else if(y[mid] < p) {
					low = mid + 1;
				
				}
				else {
					high = mid - 1;
				}
			}
			
			
		}
		
		//removingExtra element removes repeted element 
		//print method prints the element 
		
		print(arr1, removingExtra(arr1, q));
		
	}
	public static void print(int[] x, int a) {
		for(int i = 0; i < a; i++) {
			System.out.println(x[i]);
		}
	}
	public static int removingExtra(int[] x, int a) {
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//this take user input of arr
		System.out.println("Enter number of element in first Array: ");
		int n1 = sc.nextInt();
		//number of element in arr1
		int[] arr1 = new int[n1];
		for(int i = 0; i < n1; i++) {
			//takes input for arr1 in sorted order
			System.out.print("Enter " + i + "th element of array in sorted order:  ");
			int x = sc.nextInt();
			arr1[i] = x;
			System.out.println("");
		}
		System.out.println("Enter the number of element in second Array in sorted order: ");
		int n2 = sc.nextInt();
		//n2 = number of element in arr2 in sorted order
		int[] arr2 = new int[n2];
		for(int j = 0; j < n2; j++) {
			//takes input of element in arr2
			System.out.print("Enter " + j + "th element of array: ");
			int y = sc.nextInt();
			arr2[j] = y;
			System.out.println("");
		}
		//method that give another array containing common elements in both arr1 and arr2
	    arr(arr1, arr1.length-1, arr2, arr2.length-1);
		
	}

}
//Question 3 answer: solution 2 can be improved by finding the intersection point between the array by creating a variable like "k" to keep track of the elements that are present in the first array.
	//Since the both arrays are sorted already we can set x = 0, y = 0, k = 0. x will be the index of array 1 and y will be the index of array 2 and k will be the index of array 3. if array1[i] < array[j], then the "i" is incremented by 1
	//if array1[x] > array[y]. then y will be incremented by 1, if array1[x] == array[y], then we check if arrau1[x] already exists in array 3[k]. If the array is not present then we will insert array3 and increment x,y, and k by 1. And these steps can be repeated until x==array1.length or y ==array2.length
	//To solve the problem with linear complexity O(m+n) and space complexity of O(1), we can basically find an intersection point  and store the results from it and create a variable that keeps track of the elements and traverse it through arrays
	//if the common element is found, we increment the values of x and y. If the current element in the first array is smaller than the second array the x increases, if the current element in the second array is larger then the y value increases.


