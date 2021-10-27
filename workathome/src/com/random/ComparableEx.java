package com.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp implements Comparable<Emp> {

	int empId;
	String name;

	public Emp(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Emp e) {
		return empId > e.empId ? 1 : -1;
	}

}

public class ComparableEx {
	
	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		
		System.out.println("Test");
		
		empList.add(new Emp(10, "Ed"));
		empList.add(new Emp(5, "Edd"));
		empList.add(new Emp(18, "Eddy"));
		 
		Collections.sort(empList);
		
		for(Emp emp : empList) {
			System.out.println(emp);
		}
	}



}
