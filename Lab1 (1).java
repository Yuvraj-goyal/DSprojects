package daer;
import java.util.Scanner;
public class Lab1 {
//	public static void  PersonalizedHelloWorld(){
//		System.out.println("Enter your name: ");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		 String x = sc.nextLine();
		while(x.length() == 0) {
		if(x.length() == 0) {
		System.out.print("please enter your name: ");
		 x = sc.nextLine();
		}
	}
		System.out.println("Hello  " + x + "!");
}}
