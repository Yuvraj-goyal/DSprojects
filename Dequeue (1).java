package labds;
import java.util.*;
import java.io.*;
import java.util.LinkedList;

public class Dequeue {
	Queue<Integer> q;
	
	ArrayDeque<Integer> dq;
	//constructor for the class
	
	Dequeue(){
		q= new LinkedList<>();
		dq= new ArrayDeque<>();
	}
	
	public void enqueue(int data) {
		//finds correct position of the element
		
		while(!dq.isEmpty() && dq.getLast() < data) {
			dq.removeLast();
		}
		//add element at the end
		dq.addLast(data);
		q.add(data);
	}
	public void deque() {
		 if(dq.getFirst() == q.peek()){
		        
	            dq.removeFirst();
	        }
	        q.remove();
	       
	        //removes the element that user wanted to remove
	        
	    }
	 int getMax() throws Exception{ 
		 // if the queue is empty then it will throw an exception
	    	
	        //check if the element is empty
	    	
	        if(q.isEmpty())
	        
	            throw new Exception("Queue is Empty"); 
	        // if the queue us empty and user tries to print anything then the 
	            //it will throw an exception and let the user know that the queue is empty 
	       
	        else
	            return dq.getFirst(); 
	        //if the queue is not empty then it will print the first element from the queue 
	    }

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Dequeue dq = new Dequeue();
        while(true){ //provides the user with the option that they can choose, like they can add, delete or get the max value from the queue 
        
            System.out.println("Options ");
            System.out.println("1. Push"); //adds in the elements 
            
            System.out.println("2. Pop"); //gets the elements out
            
            System.out.println("3. Get Max"); // gets the max value of the queue 
           
            System.out.println("4. Quit");//breaks the program and exists out
            
            
           //takes in user input 
            Scanner input = new Scanner(System.in);
            
            //takes in user input and reads the option that the user choose 
            int choice = input.nextInt();
            
            if(choice == 1){
                System.out.println("Enter the element");
                int n = input.nextInt(); //stores the element 
                dq.enqueue(n);
            }
            else if(choice == 2){ 
                System.out.println("Element is removed"); //the element will be removed if the user choose option 2
                
                dq.deque(); //removes the element 
                
            }else if(choice == 3){ 
                System.out.println("The max element is " + dq.getMax()); //if the user chooses option 3, then it will return the maximum from the queue 
          
            }else if(choice == 4){
                break; // if the user chooses to quit the program then they choose option 4 which breaks the program
            }
        }
	}

}
