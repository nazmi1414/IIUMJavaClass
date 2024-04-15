package assignment6;
import java.util.*;

public class ShoppingCart {

	private String[] item = new String[20];
	private int itemCount = 0;
	private int itemRemoved = 0;
	
	public ShoppingCart() {
		
	}
	
	public ShoppingCart(String items) {
		item[itemCount] = items;
		itemCount++;
	}
	
	public void addToCart(String items) {
		item[itemCount] = items;
		itemCount++;
	}
	
	public void dropFromCart(String items) {
		int index = -1;
		
		for(int i = 0 ; i < 20 ; i++) {
			if(item[i].equalsIgnoreCase(items))
				index = i;
		}
		if(index >= 0) {
			
			for (int j = index + 1 ; j < 20 ; j++)
				item[j - 1] = item[j];

			itemCount--;
			itemRemoved++;
		}
	}
	
	public String[] getItem() {
		return item;
	}
	
	public int getNumberOfItem() {
		return itemCount;
	}
	
}