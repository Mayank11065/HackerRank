package pkgJava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		char[] charArray = a.toCharArray();
	
		int i =0,k = charArray.length;
		boolean equal = true;
		
		while(i<charArray.length/2)
		{
			if(charArray[i] != charArray[k-1])
			{
				equal=false;
				break;
			}
			i++;
			k--;
		}
		if(equal)
			System.out.println("Yes");
		else
			System.out.println("No");
		s.close();
	}

}
