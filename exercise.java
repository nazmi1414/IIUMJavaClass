package SatuApril;
import java.util.Scanner;
public class exercise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int TotalStudent, score, highest = 0;
		 String highestname = null;
		
		System.out.println("Please enter number of students: ");
		TotalStudent = input.nextInt();
		
		for(int i = 0; i < TotalStudent; i++) {
			
			System.out.println("Enter student name: ");
			String name = input.next();
			
			System.out.println("Enter the score: ");
			score = input.nextInt();
			
			if(score > highest) {
				highest = score;
				highestname = name;

			}
			
		}
		System.out.println("The student with a highest score is " + highestname + " with score " + highest);
	}

}
