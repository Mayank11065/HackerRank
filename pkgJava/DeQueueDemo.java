package pkgJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeQueueDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
           
            deque.add(num);
            if(map.containsKey(num))
            	map.put(num, map.get(num)+1);
            else
            	map.put(num,1);
            
            if(deque.size() == m+1)
            {
            	int r = (int) deque.remove();
            	if(map.get(r) > 1)
            	{
            		map.put(r, map.get(r)-1);
            	}
            	else
            	{
            		map.remove(r);
            	}
            }
            if(deque.size() == m)
            {
            	
            	max = max > map.size()?max:map.size();
            	
            }
        }
        in.close();
        System.out.println(max);
	}

}
