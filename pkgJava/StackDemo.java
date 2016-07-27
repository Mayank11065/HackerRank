package pkgJava;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	            //Complete the code
	         Stack<Character> s = new Stack<Character>();
	         boolean flag = true;
	         for(int i =0;i<input.length();i++)
	         {
	        	 char check = input.charAt(i);
	        	 
	        	 if(check == '{' || check == '[' || check == '(')
	        		 s.push(check);
	        	 else
	        	 {
	        		 if(s.isEmpty())
	        		 {
	        			 flag = false;
	        			 break;
	        		 }
	        		 char verify = s.peek();
	        		 switch (check) 
	        		 {
						case '}':
							if(verify == '{')
								s.pop();
							else
								s.push(check);
							break;
						case ')' :
							if(verify == '(')
								s.pop();
							else
								s.push(check);
							break;
						case ']' :
							if(verify == '[')
								s.pop();
							else
								s.push(check);
							break;
					}
	        	 }
	        	 
	         }
	         if(s.isEmpty() && flag == true)
	        	 System.out.println("true");
	         else
	        	 System.out.println("false");
	      }
	      sc.close();
	}

}
