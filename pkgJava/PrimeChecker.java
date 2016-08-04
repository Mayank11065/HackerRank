package pkgJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;

class Prime{
	
	void checkPrime(int... input )
	{
		ArrayList<Integer> prime = new ArrayList<Integer>();
		for(int i =0;i < input.length;i++)
		{
			int inp = input[i];
			if(inp ==2 || inp ==3)
				prime.add(inp);
			int sqRoot = (int) Math.pow(inp, 0.5);
			if(inp %2 == 0 || inp%3 == 0 || inp ==1);
			else
			{
				int k = 1;
				int divisor = 0;
				while(divisor <= sqRoot)
				{
					divisor = 6*k-1;
					if(inp %divisor == 0)
						break;
					divisor = 6*k+1;
					if(inp %divisor == 0)
						break;
					k++;
				}
				
				if(divisor > sqRoot)
					prime.add(inp);
			}
		}
		if(!prime.isEmpty())
		{
			
			for(int i =0;i<prime.size()-1;i++)
				System.out.print(prime.get(i) + " ");
			System.out.println(prime.get(prime.size()-1));
		}
		else
			System.out.println();
		
	}
}

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods=Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

}
