package pkgJava;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class StudentNew{
	   private int token;
	   private String fname;
	   private double cgpa;
	   public StudentNew(int id, String fname, double cgpa) {
	      super();
	      this.token = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getToken() {
	      return token;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}

class Compare<T extends StudentNew> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {

		double diff = o1.getCgpa() - o2.getCgpa();
		if(diff != 0)
			return diff > 0 ? -1 : 1;
		else
		{
			int strRes = o1.getFname().compareTo(o2.getFname());
			if(strRes != 0)
				return strRes > 0 ? 1 : -1;
			else
				return o2.getToken() - o1.getToken()  > 0 ? 1 : -1; 
		}
	}
	
}

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	      int totalEvents = Integer.parseInt(in.nextLine());
	      Compare<StudentNew> c = new Compare<StudentNew>();
	      PriorityQueue<StudentNew> p = new PriorityQueue<StudentNew>(11,c);
	      while(totalEvents>0){
	         String event = in.next();
	            if(event.equals("SERVED"))
	            {
	            	if(p.size() > 0)
	            		p.remove();
	            }
	            else
	            {
	            	String fname = in.next();
	            	double cgpa = in.nextDouble();
	            	int token  = in.nextInt();
	            	StudentNew s = new StudentNew(token, fname, cgpa);
	            	
	            	p.add(s);
	            	
	            }
	         totalEvents--;
	      }
	      in.close();
	      
	      if(p.size() == 0)
	      {
	    	  System.out.println("EMPTY");
	    	  return;
	      }
	      while(true) {
	    	  StudentNew s = p.poll();
	          if(s == null) {
	              break;
	          }

	          System.out.println(s.getFname());
	      }

	}

}
