package daer;
import java.util.Scanner;
public class Guess_my_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter n: ");
		int x = sc.nextInt();
		int y = x;
		while(x == 0 || x<0) {
			System.out.print("Enter a positive integer for n: ");
			x = sc.nextInt();
		}
		System.out.println("Welcome to guess my number!");
		System.out.println("Please think of a number between 0 and " + (x-1));
	
		
		for(int d = 0; d<1; d--) {
			System.out.println("is your number "+ ((x-1)/2)+"?");
			System.out.println("Please enter C for correct, H for too high, or L for too low.");
			String i = sc.next();
			 
		switch(i){
		case "C":
			System.out.println("thank you for playing guessing game");
			d = 2;
		     break;
	    case "H":
	    	x = y + (x-1)/2 + 1;
	    case "L":
	    	x = 0+(x-1)/2 + 1;
	    	
	    	
	    	
	    	
		
		
		}
		
		}
	}
}

