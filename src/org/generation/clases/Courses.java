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
		   System.out.println("Agregado");
		      //TODO add the student to the collection
		   }

		   public void unEnroll(Student student){
			   ListadeEstudiantes.remove(student);
			   System.out.println("Removido");
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
		   }

		   public int countStudents(){
			   ListadeEstudiantes.size();
		       //TODO implement
		       return ListadeEstudiantes.size();

		   }
		   
		   public int bestGrade(){
		       //TODO implement
		       return 0;
		   }
		   
		   public Courses (String courseName, String professorName, int year) {
			   this.courseName= courseName;
			   this.professorName= professorName;
			   this.year= year;
		   }
		
	

}
