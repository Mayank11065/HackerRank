package pkgJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Arithematic{
	
	double get_volume(int val)
	{
		return val*val*val;
	}
	
	double get_volume(int l, int b, int h)
	{
		return l*b*h;
	}
	
	double get_volume(double r)
	{
		return (2*Math.PI*Math.pow(r, 3))/3;
	}
	
	double get_volume(double r, double h)
	{
		return Math.PI*Math.pow(r, 2)*h;
	}
}

class Test{
	
	void display(double volume)
	{
		System.out.println(String.format("%.3f",volume));
	}
	
}
class Calculate {
	
	BufferedReader br;
	public Test output;
	Calculate()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		output = new Test();
	}
	int get_int_val() throws NumberFormatException, IOException
	{
		int val = Integer.parseInt(br.readLine());
		if(val <=0)
		{
			throw new NumberFormatException("All the values must be positive");
		}
		return val;
	}
	
	double get_double_val() throws NumberFormatException, IOException
	{
		double val =  Double.parseDouble(br.readLine());
		if(val <=0)
		{
			throw new NumberFormatException("All the values must be positive");
		}
		return val;
	}
	
	static Arithematic do_calc()
	{
		return new Arithematic();
	}
	
}

public class VolumeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
			    Calculate cal = new Calculate();
			    int T = cal.get_int_val();
			    while (T--> 0) {
			     double volume = 0.0;
			     int ch = cal.get_int_val();
			     if (ch == 1) {
			      int a = cal.get_int_val();
			      volume = Calculate.do_calc().get_volume(a);
			     } else if (ch == 2) {
			      int l = cal.get_int_val();
			      int b = cal.get_int_val();
			      int h = cal.get_int_val();
			      volume = Calculate.do_calc().get_volume(l, b, h);

			     } else if (ch == 3) {
			      double r = cal.get_double_val();
			      volume = Calculate.do_calc().get_volume(r);

			     } else if (ch == 4) {
			      double r = cal.get_double_val();
			      double h = cal.get_double_val();
			      volume = Calculate.do_calc().get_volume(r, h);

			     }
			     cal.output.display(volume);
			    }

			   } catch (NumberFormatException e) {
			    System.out.print(e);
			   } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
