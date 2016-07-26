package pkgJava;

import java.util.Scanner;

public class Anagram {


	static String stringAfterRemoval(String s, int pos)
	{
		return s.substring(0, pos) + s.substring(pos+1,s.length());
	}
	
	static boolean isAnagram(String a, String b) 
	{
		if(a.length() != b.length())
			return false;
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		for(int i =0;i<a.length();i++)
		{
			char c = a.charAt(i);
			int pos=b.indexOf(c);
			if(pos >= 0)
				b = stringAfterRemoval(b, pos);
			else
				return false;
		}
		
		return true;
    }
  
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
