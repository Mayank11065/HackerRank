package pkgJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameChecker {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      int i =0;
	      while(testCases>0){
	    	  i++;
	         String username = in.nextLine();
	      
	         String pattern = "^[A-Za-z][A-Za-z_0-9]{7,29}$";
	         Pattern r = Pattern.compile(pattern);
	         Matcher m = r.matcher(username);
	          
	         if (m.find( )) {
	            System.out.println(i + ".  Valid");
	         } else {
	            System.out.println(i + ".  Invalid");
	         }
	         testCases--;
	      
	      }
	}

}
