package pkgJava;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		BigInteger a = s.nextBigInteger();
		BigInteger b = s.nextBigInteger();
		
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		s.close();
	}

}
