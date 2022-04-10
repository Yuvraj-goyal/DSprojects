package lab3;
import java.util.Scanner;
public class Lab4 {
	public static int[] sorted(int[] x) {
		int y = x.length;
		//bublle sort
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < y-1-i; j++) {
				if(x[j] > x[j+1]) {
					//sort element if they are smaller 
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
		}
		return x;
	}
	static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
      
        // To store index of next unique element
        int j = 0;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
      
        arr[j++] = arr[n-1];
      
        return j;
    }
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
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		// accessing array elements using the for loop  
		array = sorted(array);
		int c = array.length;
		c = removeDuplicates(array,c);
		for(int i = 0; i<c; i++) {
			System.out.println(array[i]);
		}
	
	}

}
