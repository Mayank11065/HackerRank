package pkgJava;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		int i = 1;
		while(s.hasNext())
		{
			String str = s.nextLine();
			System.out.println(i++ + " " + str);
		}
		s.close();
	}

}
