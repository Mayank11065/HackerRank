package pkgJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}

class Sorter<T extends Student> implements Comparator<T>
{

	@Override
	public int compare(T o1, T o2) {
		
		if(o1.getCgpa()!= o2.getCgpa())
			return (o1.getCgpa() - o2.getCgpa()) > 0 ? -1 : 1;
		else
		{
			if(!o1.getFname().equals(o2.getFname()))
				return o1.getFname().compareTo(o2.getFname());
			else
				return (o2.getId() - o1.getId()) > 0 ? 1 : -1;
		}
	}
	
}

public class ComparatorSortDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	      in.close();
	      
	      Sorter<Student> sort = new Sorter<Student>();
	      Collections.sort(studentList, sort);
	      
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }
	}

}
