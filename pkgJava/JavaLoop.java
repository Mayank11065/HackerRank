package pkgJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaLoop {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int cases = Integer.parseInt(br.readLine());
			
			while(cases-- > 0){
				
				String s = br.readLine();
				StringTokenizer st = new StringTokenizer(s);
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				
				int i=0;
				int tempSum = (int) (a+(b*Math.pow(2, i)));
				System.out.print(tempSum);
				while(i < n-1)
				{
					i++;
					tempSum += (b*Math.pow(2, i));
					System.out.print(" " + tempSum);
				}
				System.out.println();
			}
			
			
			
			
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
