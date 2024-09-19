package org.generation.clases;

public class Student {
	//ATRIBUTOS
		       String firstName;
		       String lastName;
		       int registration;
		       int grade;
		       int year;
		       
		       //METODO PARA MOSTRAR INFO-ATRIBUTOS
		       public String printFullName() {
		    	   return "El nombre de la persona es:"+ this.firstName + " " + lastName;
		       }
		       public boolean isApproved(){
		    	   if(grade >= 60){
		    		   return true; //return true trabaja con IF
		    	   }else {
		    		   return false;//return false trabaja con else
		    	   }
		           //TODO implement: should return true if grade >= 60
		       }
		       public int changeYearIfApproved(){
		    	   if(isApproved()) {
		    		   year = year + 1;
		    		   System.out.println("FELICIDADES");
		    	   }else {
		    		   System.out.println("NO SEAS SOPE");
		    	   }
		           //TODO implement: the student should advance to the next year if he/she grade is >= 60
		           // Make year = year + 1, and print "Congratulations" if the student has been approved
		           return year;
		       }
		       
		       public Student (String firstName, String lasName, int registration, int grade, int year) {
		    	   this.firstName=firstName;
		    	   this.lastName=lasName;
		    	   this.registration=registration;
		    	   this.grade=grade;
		    	   this.year=year;
		       }//constructor
		       
		       public Student(String firstName, int grade){
		    	   this(firstName, "lastName", grade, 0, 1 );
		       }//constructor
		       
		       public Student(String firstName){
		    	   this(firstName, "lastName", 50, 0, 1 );
		       }//constructor
		       
		 
		       
		       
		   
}

