package algorithm.warmup;

import java.util.Scanner;

public class TripletsCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		for(int i = 0;i < 3;i++)
			a[i] = in.nextInt();
		for(int i = 0;i < 3;i++)
			b[i] = in.nextInt();
				
        in.close();
        
        int aScore =0, bScore =0;
        for(int i = 0;i < 3;i++)
        {
        	if(a[i] > b[i])
            	aScore++;
            else if(a[i] < b[i])
            	bScore++;
        }
        System.out.println(aScore + " " + bScore);
        
	}

}
