package SatuApril;
import java.util.*;

public class fourth_March {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of student: ");
		int No_Student = input.nextInt();
		
		int[] Marks = new int[No_Student];
		int best = 0;
		
		System.out.println("Enter "+ No_Student + " scores: ");
		for(int i = 0; i<No_Student ; i++)		
			Marks[i] = input.nextInt();
		
		for(int y = 0 ; y < No_Student ; y++) {
			if(best <= Marks[y])
				best = Marks[y];
		}
		
		int A = best - 10,
		B = best - 20,
		C = best - 30,
		D = best - 40;
		
		for(int i = 0 ; i < No_Student ; i++) {
				if(Marks[i] >= A)
					System.out.println("Student "+ i +" score is "+ Marks[i] + " and grade is A.");
				
				else if(Marks[i] >= B)
					System.out.println("Student "+ i +" score is "+ Marks[i] + " and grade is B.");
					
				else if(Marks[i] >= C)
					System.out.println("Student "+ i +" score is "+ Marks[i] + " and grade is C.");
					
				else if(Marks[i] >= D)
					System.out.println("Student "+ i +" score is "+ Marks[i] + " and grade is D.");	
					
				else
					System.out.println("Student "+ i +" score is "+ Marks[i] + " and grade is F.");
		}
		
	}}
