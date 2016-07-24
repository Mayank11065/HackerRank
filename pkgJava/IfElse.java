package pkgJava;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;//sc.nextInt();
        while(n < 100)
        {
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else{
            if((n>=2 && n<=5) || n > 20 )
                ans = "Not Weird";
            else
                ans = "Weird";
        }
        System.out.println(n + " : " + ans);
        n++;
        }
        sc.close();
    }

}
