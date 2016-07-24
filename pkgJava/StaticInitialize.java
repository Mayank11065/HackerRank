package pkgJava;

import java.util.Scanner;

public class StaticInitialize {


static boolean flag = false;
static int B = 1;
static int H = 1;

static{
	Scanner s = new Scanner(System.in);
	B = s.nextInt();
	H  =s.nextInt();
	if(B >0 && H > 0 )
		flag = true;
	else
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	s.close();
}



	public static void main(String[] args) {
		System.out.println("Hello");
		if(flag){
			int area=B*H;
			
			System.out.print(area);
	}
		
	}
	

}
