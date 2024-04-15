package SatuApril;
import java.util.Scanner;

public class testlectures {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many Lecturer?");
		int number = input.nextInt();
		
		lectures[] oop = new lectures[number];
		
		for(int i = 0 ; i<number ; i++) {
			oop[i] = new lectures();
			
			System.out.println("Lecturer" + (i+1));
			
			System.out.print("Enter name: ");
			oop[i].setname (input.next());
			
			System.out.print("\nEnter age: ");
			oop[i].setage (input.nextInt());
			
			System.out.print("\nEnter staff id: ");
			oop[i].setid (input.next());
			
			System.out.print("\nEnter address: ");
			oop[i].setaddr (input.next());
			
			System.out.print("\nEnter salary: ");
			oop[i].setsalary (input.nextDouble());
		}
		
		for(int k =0 ; k<number ; k++) {
			System.out.println("Lecturer" + (k+1));
			System.out.println("\nName: " + oop[k].getname());
			System.out.println("Age: " + oop[k].getage());
			System.out.println("Staff ID: " + oop[k].getid());
			System.out.println("Address: " + oop[k].getaddr());
			System.out.println("Salary: " + oop[k].getsalary());
		}
	}

}
