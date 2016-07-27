package pkgJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayListDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<ArrayList<Integer>> intArr = new ArrayList<ArrayList<Integer>>();
		
		int lines = Integer.parseInt(br.readLine());
		for(int i =0;i<lines;i++)
		{
			String strLine = br.readLine();
			StringTokenizer st = new StringTokenizer(strLine," ");
			int row = Integer.parseInt(st.nextToken());
			
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j =0;j<row;j++)
			{
				temp.add(Integer.parseInt(st.nextToken()));
			}
			intArr.add(temp);
		}
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<testCase;i++)
		{
			String strLine = br.readLine();
			StringTokenizer st = new StringTokenizer(strLine," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(intArr.get(x-1).size() >= y)
			{
				System.out.println(intArr.get(x-1).get(y-1));
			}
			else
				System.out.println("ERROR!");
		}
		
	}

}
