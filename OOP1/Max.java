package OOP1;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
		
		double[] Number = new double[10];
		
		for(int i = 0; i<10 ; i++)
			Number[i] = input.nextDouble();
		
		double Max = max(Number);
		System.out.println("The maximum number is : " + Max );

	}
public static double max (double[] number) {
	double temp_array=0;
	for(int j = 0 ; j < 10 ; j++) {
		for(int k = 1 ; k < 10 ; k++) {
			
			if(number[k] > number[k-1]) {
				
				temp_array = number[k];
				number[k] = number[k-1];
				number[k-1] = temp_array;
				
			}
		}}
	return number[0];
	
}
}
