package pkgJava;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxCheck {

	static boolean patternMatch(String str)
	{
		try{
			
			Pattern.compile(str);
			
		}catch(PatternSyntaxException pse)
		{
			return false;
		}
		
		
		return true;
	}
	public static void main(String[] arg)
	{
		Scanner s = new Scanner(System.in);
		
		int cases = s.nextInt();
		s.nextLine();
		
		while(cases-- > 0)
		{
			String pattern  = s.nextLine();
			
			if(patternMatch(pattern))
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
		s.close();
		
	}
}
