package lab8;

import java.util.Stack;

public class Postfix {
	public static boolean check(char character) {
		if(character == '0'|| character == '1'|| character == '2' || character == '3'|| character =='4' || character == '5' || character == '6' || character == '7' || character == '8' || character == '9' ) {
			return true;
		}
		return false;
	}
	 static int Postfix(String val) {
	Stack<Integer> stack =new Stack<>();
		for(int i=0; i<val.length();i++) {
			char c = val.charAt(i);
			if(val.charAt(i) == ' ') {
				continue;
				}
			else if(check(val.charAt(i))) {
			
				int n = 0;
				while(check(val.charAt(i))) {
					n = n*10 + (int)(val.charAt(i) - '0');
					i++;
				}
				i--;
				stack.push(n);
			}
			else {
				int value1=stack.pop();
				int value2=stack.pop();
				switch(c)
				{
				case '+':
					stack.push(value2+value1);
                    break;
                     
                    case '-':
                    stack.push(value2- value1);
                    break;
                     
                    case '/':
                    stack.push(value2/value1);
                    break;
                     
                    case '*':
                    stack.push(value2*value1);
                    break;	
				}
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "3 5 + 1 -";
		
		 System.out.println("postfix : "+Postfix(expression));
	}
	//Time and space complexity of this code is O(n)

}
