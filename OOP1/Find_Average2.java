package OOP1;

import java.util.Scanner;

public class Find_Average2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 double values: ");
		
		double[] Number = new double[5];
		
		for(int i = 0; i<5 ; i++)
			Number[i] = input.nextDouble();
		
		System.out.println("The average value is : " + average(Number));
		
		double integer = (int)(average(Number));
		double decimal = ((average(Number) * 10 )% 10);
		double NewAverage = (integer + decimal) /2;

		System.out.println("The average value for " + integer + " and " + decimal +" is "+ NewAverage);
		
	}
public static double average(double[] number) {
	
	double Sum=0;
	double avg;
	
	for(int j = 0 ; j<5 ; j++) 
		Sum += number[j];
	avg = Sum /(number.length);
	return avg;
	}
}
