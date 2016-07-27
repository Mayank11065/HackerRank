package pkgJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(br.readLine());
		
		int count =0;
		while(testCases-- > 0)
		{
			String input = br.readLine();
			
			if(set.add(input))
				count++;
			System.out.println(count);
		}
	}

}
