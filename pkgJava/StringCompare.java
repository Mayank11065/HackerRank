package pkgJava;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count  = s.nextInt();
		int itr = str.length() -count+1;
		int start = 0;
		int end = start+count;
		String subStr = str.substring(start, end);
		String max = subStr, min = subStr;
		
		while(itr-- > 0)
		{
			subStr = str.substring(start, end);
			if(subStr.compareTo(max)>0)
				max = subStr;
			if(min.compareTo(subStr)>0)
				min = subStr;
			start = start+1;
			end = end+1;
			
		}
		System.out.println(min);
		System.out.println(max);
		
		s.close();
	}

}
