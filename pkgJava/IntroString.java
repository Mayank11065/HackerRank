package pkgJava;

import java.util.Scanner;

public class IntroString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String a = s.nextLine();
		String b = s.nextLine();
		
		System.out.println(a.length()+b.length());
		
		if(a.compareTo(b) > 0)
			System.out.println("Yes");
			else
				System.out.println("No");
		
		a = a.substring(0, 1).toUpperCase() + a.substring(1);
		b = b.substring(0, 1).toUpperCase() + b.substring(1);
		
		System.out.println(a + " " + b);

		s.close();
	}

}
