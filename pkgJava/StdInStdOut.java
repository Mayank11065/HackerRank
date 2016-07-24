package pkgJava;

import java.io.IOException;
import java.util.Scanner;

public class StdInStdOut {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = Integer.parseInt(br.readLine());
		double d = Double.parseDouble(br.readLine());
		String s = br.readLine();
		*/
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.nextLine();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.next();
		scan.close();
		
		System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		
	}

}
