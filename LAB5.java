package lab5;
import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int n = 0;
		//while helps to make element great
		while(n == 0) {
		System.out.print("Enter the number of positive elements you want to store: ");  
		//reading the number of elements from the that we want to enter  
		 n=sc.nextInt();  
		//creates an array in the memory of length n
		}
		int[] arr = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		arr[i]=sc.nextInt();  
		}  
		 quickSort(arr, 0, n - 1);
		 int a = removingExtra(arr, arr.length);
		 for(int  i = 0; i < a; i++) {
			 System.out.println(arr[i]);
		 }
	}
	static int removingExtra(int[] arr, int n){
       if (n == 0 || n == 1)
            return n;
      
        // To store index of next unique element
        int j = 0;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        }
      
        arr[j++] = arr[n-1];
      
        return j;
    }


  
//A utility function to swap two elements
static void swap(int[] arr, int i, int j)
{
 int temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp;
}

/* This function takes last element as pivot, places
the pivot element at its correct position in sorted
array, and places all smaller (smaller than pivot)
to left of pivot and all greater elements to right
of pivot */
static int partition(int[] arr, int low, int high)
{
  
 // pivot
 int pivot = arr[high];
  
 // Index of smaller element and
 // indicates the right position
 // of pivot found so far
 int i = (low - 1);

 for(int j = low; j <= high - 1; j++)
 {
      
     // If current element is smaller
     // than the pivot
     if (arr[j] < pivot)
     {
          
         // Increment index of
         // smaller element
         i++;
         swap(arr, i, j);
     }
 }
 swap(arr, i + 1, high);
 return (i + 1);
}

/* The main function that implements QuickSort
       arr[] --> Array to be sorted,
       low --> Starting index,
       high --> Ending index
*/
static void quickSort(int[] arr, int low, int high)
{
 if (low < high)
 {
      
     // pi is partitioning index, arr[p]
     // is now at right place
     int pi = partition(arr, low, high);

     // Separately sort elements before
     // partition and after partition
     quickSort(arr, low, pi - 1);
     quickSort(arr, pi + 1, high);
 }
}}
