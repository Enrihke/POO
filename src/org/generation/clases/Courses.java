package org.generation.clases;
import java.util.ArrayList;
import java.util.List;


public class Courses {
	String courseName;
	String professorName;
	int year;
	
	List<Student>ListadeEstudiantes= new ArrayList<Student>();
	
	
	   public void enroll(Student student){
		   ListadeEstudiantes.add(student);//student (Objeto) de la clase Student
		      //TODO add the student to the collection
		   }

		   public void unEnroll(Student student){
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
		   }

		   public int countStudents(){
		       //TODO implement
		       return 0;
		   }
		   
		   public int bestGrade(){
		       //TODO implement
		       return 0;
		   }
		
	

}
