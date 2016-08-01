package pkgJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			int res = x/y;
			System.out.println(res);
		} catch (NumberFormatException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		
	}

}
