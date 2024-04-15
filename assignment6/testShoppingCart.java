package assignment6;
import java.util.*;

public class testShoppingCart {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		ShoppingCart cart = new ShoppingCart();
		
		do {
			System.out.print("Enter the name of item: ");
			cart.addToCart(input.next());
			
			System.out.print("Any item to remove from cart?(y/n): ");
			if(checkUser()) {
				System.out.print("Enter the name of item: ");
				cart.dropFromCart(input.next());
			}
			
			System.out.print("List of items: ");
			String[] item = cart.getItem();
			for(int x = 0 ; x < cart.getNumberOfItem() ; x++)
				System.out.print(item[x] + ", ");
			
			System.out.print("\nContinue shopping?(y/n): ");
		}while(checkUser());
	}

	public static boolean checkUser() {
		
		char check = input.next().charAt(0);
		
		if(check == 'Y' || check == 'y')
			return true;
		
		else
			return false;
		
		}
}
