package SatuApril;

import java.util.Scanner;

public class testfan {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("How many fan?");
		int number = input.nextInt();
		
		fan[] kipas = new fan[number];
		
		for(int i = 0 ; i<number ; i++) {
			kipas[i] = new fan();
			
			System.out.println("Fan" + (i+1));
			
			System.out.print("Set Speed: ");
			kipas[i].setspeed (input.nextInt());
			
			System.out.print("\nEnter status: ");
			kipas[i].seton (input.nextBoolean());
			
			System.out.print("\nEnter radius: ");
			kipas[i].setradius (input.nextInt());
			
			System.out.print("\nEnter color: ");
			kipas[i].setcolor (input.next());
			
		}
		
		for(int k =0 ; k<number ; k++) {
			System.out.println("Fan" + (k+1));
			System.out.println("\nSpeed: " + kipas[k].getspeed());
			System.out.println("Switch: " + kipas[k].geton());
			System.out.println("Radius: " + kipas[k].getradius());
			System.out.println("Color: " + kipas[k].getcolor());
		}

	}
public String speed (int speed) {
	if (speed == 1){
		return SLOW;
	}
	else if(speed == 2) {
		return MEDIUM;
	}
	else if(speed == 3) {
		return FAST;
	}
}
}
