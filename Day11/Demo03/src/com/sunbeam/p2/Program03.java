package com.sunbeam.p2;

import java.util.Set;
import java.util.TreeSet;

public class Program03 {

	public static void main(String[] args) {
		Set<Employee> s1 = new TreeSet<Employee>();
		s1.add(new Employee(4, "Mukesh", 50000));
		s1.add(new Employee(1, "Anil", 30000));
		s1.add(new Employee(5, "Suresh", 10000));
		s1.add(new Employee(3, "Nitin", 40000));
//		s1.add(null); // NOT OK -> NullPointerException
		s1.add(new Employee(2, "Ramesh", 20000));
		s1.add(new Employee(2, "Ramesh", 20000));

		for (Employee e : s1) {
			System.out.println(e);
		}

	}

}