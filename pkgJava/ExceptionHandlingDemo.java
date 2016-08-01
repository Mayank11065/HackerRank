package pkgJava;

import java.util.Scanner;

class MyCalculator1 {
	
	int power(int n, int p) throws Exception
	{
		if(n < 0 || p <0)
			throw new Exception("n and p should be non-negative");
		else
			return (int) Math.pow(n, p);
	}
}
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		  while ( in .hasNextInt()) {
		   int n = in .nextInt();
		   int p = in .nextInt();
		   MyCalculator1 my_calculator = new MyCalculator1();
		   try {
		    System.out.println(my_calculator.power(n, p));
		   } catch (Exception e) {
		    System.out.println(e);
		   }
		  }
		  in.close();
	}

}
