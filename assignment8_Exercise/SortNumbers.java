package assignment8_Exercise;
import java.util.ArrayList;

public class SortNumbers {

	public static void main(String[] args) {

		ArrayList<Number> list = new ArrayList<Number>();
		list.add(14);
		list.add(24);
		list.add(4);
		list.add(42);
		list.add(5);
		sort(list);

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}

	public static void sort(ArrayList<Number> list) {
		Number temp;
		
		for(int k = 0 ; k < list.size() ; k++) {
			for(int j = 1 ; j < list.size() ; j++) {
				if((int)list.get(j) < (int)list.get(j - 1)) {
				temp = list.get(j - 1);
				list.set(j - 1, list.get(j));
				list.set(j, temp);
				}
			}
		}
	}
}
