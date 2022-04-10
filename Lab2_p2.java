package dataStructureLab;
import java.util.Scanner;
public class Lab2_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of element u want to enter in array: ");
		int x = sc.nextInt();
		int arr[] = new int[x];
		for(int i = 0; i < x; i++) {
			System.out.println("Enter " + (i + 1) + "th no. ");
			arr[i] = sc.nextInt();
			}
		int sum = 0;
		for(int k = 0; k < arr.length; k++) {
				int f = (int)Math.pow(10,k);
				sum = sum + f*arr[x-k-1];
				
				
			
			
		}
		System.out.println(sum+1);
			
	}

}
