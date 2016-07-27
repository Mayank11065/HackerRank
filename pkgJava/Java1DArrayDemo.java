package pkgJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1DArrayDemo {

	public static boolean canReachEnd(int[] arr,int m, int pos)
	{		
		if(pos < 0 || arr[pos] == 1)
			return false;
		
		if(pos == arr.length-1 || pos+m  >= arr.length)
			return true;
		
		arr[pos] = 1;
		
		return canReachEnd(arr, m, pos+1) || canReachEnd(arr, m, pos+m) || canReachEnd(arr, m, pos-1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		
		while(cases-- > 0)
		{
			String tempData = br.readLine();
			StringTokenizer st1 = new StringTokenizer(tempData);
			
			int n = Integer.parseInt(st1.nextToken());
			int m = Integer.parseInt(st1.nextToken());
			
			tempData = br.readLine();
			st1 = new StringTokenizer(tempData);
			
			int[] arr = new int[n];
			
			for(int i =0;i<arr.length;i++)
				arr[i] = Integer.parseInt(st1.nextToken());
			
			boolean result = canReachEnd(arr, m,0);
			
			if(result)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
