package assignment6;
import java.util.*;
public class testCourse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		course student1 = new course("OOP");
		course student2 = new course("Database");
		
		student1.addStudent("Nazmi");
		student1.addStudent("Ijal");
		student1.addStudent("Hazim");
		student2.addStudent("Jiqli");
		student2.addStudent("Din");
		student2.addStudent("Zimam");

		System.out.print("Enter the name of students who drop OOP: ");
		String name = input.next();
		student1.dropStudent(name);
		
		ArrayList<String> studentOOP = new ArrayList<String>();
		studentOOP = student1.getStudents();
		
		for(int x = 0 ; x < studentOOP.size(); x++)
			System.out.println(studentOOP.get(x));
	}

}
