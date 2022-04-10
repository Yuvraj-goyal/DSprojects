package dataStructureLab;
import java.util.Scanner;
public class Lab2 {

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
		
		if(x == 0) {
			System.out.println("there is no array to print");
		}else if(x == 1) {
			System.out.println(arr[0]);
		}else {
			for(int a = 0; a < x; a++) {
				for(int j = 0 ; j < x; j++) {
					if(j == x-1) {
						break;
					}if(arr[j] > arr[j+1] ) {
						int b = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = b;
					
					}
				}
				
				}for(int c = 0; c < x; c++) {
					System.out.print(arr[c]);
				}
			}
			
			
		
		}
	}


