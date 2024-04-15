package Exercise5;
import java.util.Scanner;

public class testPerson {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of student: ");
		get
		int Number = input.nextInt();
		Person[] per = new Person[Number];
		
		for(int i=0 ; i < Number ; i++) {
			
			per[i] = new Person();
			
			System.out.println("\nStudent " + (i+1));
			
			System.out.println("\nFirst Name: ");
			per[i].setFName (input.next());
			
			System.out.println("\nLast Name: ");
			per[i].setLName (input.next());
			
			System.out.println("\nEmail: ");
			per[i].setEmail (input.next());
			
			System.out.println("\nPhone: ");
			per[i].setPhone (input.next());
		}
		
		for(int l = 0 ; l < Number ; l++) {
			
			System.out.println("\nStudent " + (l+1));
			
			System.out.println("First Name: "+ per[l].getFName());
			
			System.out.println("Last Name: "+ per[l].getLName());
			
			System.out.println("Email: "+ per[l].getEmail());
			
			System.out.println("Phone: "+ per[l].getPhone());
			
		}
		
		System.out.println("\n==================================================================================\n");
		System.out.println("User menu: ");
		System.out.println("1. Access Student detail.");
		System.out.println("2. Change Student email.");
		System.out.println("3. Change Student Phone number.");
		System.out.println("4. End programme.");
		System.out.println("Your choice: ");
		int user = input.nextInt();
		
		if(user==1) {
			Access( input, per);}
		else if(user==2) {
			change_email(input, per);}
		else if(user==3) {
			change_Phone(input, per);}
		}
		
public static void Access(Scanner input,Person[] per) {
	System.out.println("Which student you want to see?(no only) ");
	int stud = input.nextInt();
	
	System.out.println("\nStudent " + stud);
	
	System.out.println("First Name: "+ per[stud - 1].getFName());
	
	System.out.println("Last Name: "+ per[stud - 1].getLName());
	
	System.out.println("Email: "+ per[stud - 1].getEmail());
	
	System.out.println("Phone: "+ per[stud - 1].getPhone());
}
public static void change_email(Scanner input,Person[] per) {
	
	System.out.println("Which student you want to change their email?(no only) ");
	int stud = input.nextInt();
	
	System.out.println("\nNew Email: ");
	per[stud - 1].setEmail (input.next());
	
	System.out.println("\nStudent " + stud);	
	System.out.println("First Name: "+ per[stud - 1].getFName());	
	System.out.println("Last Name: "+ per[stud - 1].getLName());	
	System.out.println("Email: "+ per[stud - 1].getEmail());	
	System.out.println("Phone: "+ per[stud - 1].getPhone());
}
public static void change_Phone(Scanner input,Person[] per) {
	System.out.println("Which student you want to change their Phone number?(no only) ");
	int stud = input.nextInt();
	
	System.out.println("\nNew Phone: ");
	per[stud - 1].setPhone (input.next());
	
	System.out.println("\nStudent " + stud);	
	System.out.println("First Name: "+ per[stud - 1].getFName());	
	System.out.println("Last Name: "+ per[stud - 1].getLName());	
	System.out.println("Email: "+ per[stud - 1].getEmail());	
	System.out.println("Phone: "+ per[stud - 1].getPhone());

}
}
