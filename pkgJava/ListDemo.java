package pkgJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ListDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int initialLength = Integer.parseInt(br.readLine());
			String initialString = br.readLine();
			StringTokenizer st = new StringTokenizer(initialString);
			List<Integer> intList = new ArrayList<Integer>();
			
			while(st.hasMoreTokens())
				intList.add(Integer.parseInt(st.nextToken()));
			
			int operations = Integer.parseInt(br.readLine());
			while(operations-- > 0)
			{
				String action = br.readLine();
				String valStr = br.readLine();
				st = new StringTokenizer(valStr);
				int x = Integer.parseInt(st.nextToken());
				
				if(action.contains("Insert"))
				{
					int y = Integer.parseInt(st.nextToken());
					intList.add(x, y);
				}
				else if(action.contains("Delete"))
				{
					intList.remove(x);
				}
			}
			
			for(int i =0;i<intList.size()-1;i++)
			{
				System.out.print(intList.get(i) + " ");
			}
			System.out.print(intList.get(intList.size()-1));
	}

}
