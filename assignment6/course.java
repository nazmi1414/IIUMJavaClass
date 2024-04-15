package assignment6;
import java.util.*;
public class course {

	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;
	
	public course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}
	public ArrayList<String> getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		int y = -1;
		
		for(int i = 0; i < numberOfStudents ; i++) {
			if (students.get(i).equalsIgnoreCase(student))
   			 y = i;
   	 
   			 students.remove(y);
       		 numberOfStudents--;
			
		}
	}
}
