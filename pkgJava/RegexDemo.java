package pkgJava;

import java.util.Scanner;

class myRegex
{
	public String p1 = "(2[0-5][0-5]|[0-1][0-9][0-9]|[0-9][0-9]|[0-9])\\."+
			"(2[0-5][0-5]|[0-1][0-9][0-9]|[0-9][0-9]|[0-9])\\."
			+ "(2[0-5][0-5]|[0-1][0-9][0-9]|[0-9][0-9]|[0-9])\\."
			+ "(2[0-5][0-5]|[0-1][0-9][0-9]|[0-9][0-9]|[0-9])";
	
	public String pattern = "([01]\\d\\d|2[0-4]\\d|25[0-5])\\.([01]\\d\\d|2[0-4]\\d|25[0-5])\\." +
			"([01]\\d\\d|2[0-4]\\d|25[0-5])\\.([01]\\d\\d|2[0-4]\\d|25[0-5])";
}

public class RegexDemo {

	
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
		
        in.close();
	}

}
