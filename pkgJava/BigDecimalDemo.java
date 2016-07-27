package pkgJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalDemo {

	public static void main(String[] args) {
		
		//Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        BigDecimal []bArray = new BigDecimal[n];
        
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
            bArray[i] = new BigDecimal(s[i]);
        }
        
        for (int i = 0; i < bArray.length; i++) {
			
        	BigDecimal max = bArray[i];
        	String maxString = s[i];
        	
        	int pos = i;
        	for (int j = i; j < bArray.length; j++) {
				if(bArray[j].compareTo(max) > 0)
				{
					pos = j;
					max = bArray[j];
					maxString = s[j];
				}
			}
        	
        	BigDecimal temp = bArray[i];
        	String tempStr = s[i];
        	
        	bArray[i] = max;
        	s[i] = maxString;
        	
        	bArray[pos] = temp;
        	s[pos] = tempStr;
		}
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
        
        sc.close();

	}

}
