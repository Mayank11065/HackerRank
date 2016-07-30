package pkgJava;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s  = new Scanner(System.in);
		
		int n = s.nextInt();
		BitSet[] b = new BitSet[2];
		b[0] = new BitSet(n);
		b[1] = new BitSet(n);
		
		int m = s.nextInt();
		
		while(m-- > 0)
		{
			String op = s.next();
			int op1 = s.nextInt();
			int op2 = s.nextInt();
			
			switch(op)
			{
			case "AND" : b[op1-1].and(b[op2-1]);
				break;
			case "OR" : b[op1-1].or(b[op2-1]);
				break;
			case "XOR" : b[op1-1].xor(b[op2-1]);
				break;
			case "FLIP" : b[op1-1].flip(op2);
				break;
			case "SET" : b[op1-1].set(op2);
				break;
			}
			
			System.out.println(b[0].cardinality() + " " + b[1].cardinality());
			
		}
		s.close();

	}

}
