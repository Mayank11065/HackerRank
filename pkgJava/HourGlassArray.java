package pkgJava;

import java.util.Scanner;

public class HourGlassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s  = new Scanner(System.in);
		
		int [][]arr = new int[6][6];
		
		for(int i =0;i<6;i++)
		{
			for(int j =0;j<6;j++)
				arr[i][j] = s.nextInt();
		}
		
		int i =0,j=0;
		int maxSum =arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
		
		for(i =0;i<6;i++)
		{
			for(j =0;j<6;j++)
			{
				if(j+2 < 6 && i+2<6)
				{
					int tempSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
					if(tempSum > maxSum)
						maxSum = tempSum;
				}
			}
		}
		
		System.out.println(maxSum);
	}

}
