package OOP1;

import java.util.*;

public class find_average {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double avg;
		System.out.println("Enter 5 double values: ");
		
		double[] Number = new double[5];
		
		for(int i = 0; i<5 ; i++)
			Number[i] = input.nextDouble();
		
		avg = average(Number);
		System.out.println("The average value is : " + avg);
		
	}
public static double average(double[] num) {
	double Sum = 0;
	double avg = 0;
	for(int j = 0 ; j<5 ; j++) 
		Sum += num[j];
		
	avg = Sum /5;
	return avg;
	}
}
