package pkgJava;

import java.util.Scanner;

public class NegativeSubArray {

	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		
		int num = s.nextInt();
		
		int []arr = new int[num];
		
		for(int i =0;i<num;i++)
		{
			arr[i] = s.nextInt();
		}
		
		int count= 0;
		for(int i =0;i<num;i++)
		{
			int sum =0;
			for(int j =i;j<num;j++)
			{
				sum +=arr[j];
				if(sum <0)
					count++;
			}
		}
		
		System.out.println(count);
	}

}
