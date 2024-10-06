package com.sunbeam;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program02 {

	public static void main(String[] args) {
		Set<Employee> s1 = new LinkedHashSet<Employee>();
		s1.add(new Employee(1, "Anil", 10000));
		s1.add(new Employee(2, "Mukesh", 20000));
		s1.add(new Employee(3, "Ramesh", 30000));
		s1.add(new Employee(4, "Suresh", 40000));
		s1.add(new Employee(6, "Suresh", 60000));
		s1.add(new Employee(5, "Ram", 50000));
		s1.add(new Employee(7, "Sham", 50000));
		s1.add(new Employee(7, "Nitin", 80000));

		for (Employee e : s1)
			System.out.println(e);
	}

}
