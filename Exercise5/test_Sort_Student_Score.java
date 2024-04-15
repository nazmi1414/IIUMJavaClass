package Exercise5;
import java.util.Scanner;

public class test_Sort_Student_Score {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of student: ");
		int No_Student = input.nextInt();
		
		Sort_Student_Score[] Student = new Sort_Student_Score[No_Student];
		
		for(int i=0 ; i < No_Student ; i++) {
			
			Student[i] = new Sort_Student_Score();
			
			System.out.println("\nStudent "+ (i+1) + " Name: ");
			Student[i].setName (input.next());
			
			System.out.println("Student "+ (i+1) + " Score: ");
			Student[i].setScore (input.nextInt());
		}
		Sorting(Student, No_Student);
		
		for(int p = 0 ; p < No_Student ; p++)
			System.out.println(Student[p].getName() +" : "+ Student[p].getScore());
}
public static void Sorting(Sort_Student_Score[] Student, int no)
{
	Sort_Student_Score temp = new Sort_Student_Score();
	
	for(int j = 0 ; j < no ; j++) {
		for(int k = 1 ; k < no ; k++) {
				
			if(Student[k].score > Student[k-1].score) {
					
			temp = Student[k];
			Student[k] = Student[k-1];
			Student[k-1] = temp;
					
			}
		}
	}
}}