package OOP1;
import java.util.Scanner;

public class SortStudentScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of student: ");
		int No_Student = input.nextInt();
		
		String[] Student_name = new String[No_Student];
		double[] Score = new double[No_Student];
		
		for(int i=0 ; i < No_Student ; i++) {
			System.out.println("\nStudent "+ (i+1) + " name: ");
			Student_name[i] = input.next();
			
			System.out.println("Student "+ (i+1) + " Score: ");
			Score[i] = input.nextInt();
		}
		Sort_Student_Score_Decreasing(Student_name, Score, No_Student);
		
		for(int p = 0 ; p < No_Student ; p++)
			System.out.println(Student_name[p] +" : "+ Score[p]);
}
public static void Sort_Student_Score_Decreasing(String[] name, double[] score, int no)
{
	double temp_Score = 0;
	String temp_Name;
	
		for(int j = 0 ; j < no ; j++) {
			for(int k = 1 ; k < no ; k++) {
				
				if(score[k] > score[k-1]) {
					
					temp_Score = score[k];
					score[k] = score[k-1];
					score[k-1] = temp_Score;
					
					temp_Name = name[k];
					name[k] = name[k-1];
					name[k-1] = temp_Name;
				}
			}
		}
}}