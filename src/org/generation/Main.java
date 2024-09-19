package org.generation;

import org.generation.clases.Courses;
import org.generation.clases.Student;

public class Main {
	public static void main(String[] args) {
		Student carlos= new Student("carlos", 50);
		Student brenda = new Student("brenda", "estrada", 2024, 50, 1);
		
		System.out.println(carlos.printFullName());
		System.out.println(brenda.printFullName());
		
		Courses Matematicas= new Courses("Matematicas", "JC", 1);
		
		Matematicas.enroll(brenda);
		
		System.out.println(Matematicas.countStudents());
	}

	

}
