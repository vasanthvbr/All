package week6.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//declare a empty set
		Set<Integer> num = new TreeSet<Integer>();
		
		//iterate the value from data array
		for (int i = 0; i < data.length; i++) {
			
			//add the values in set
			num.add(data[i]);
		}
		System.out.println(num);
		
		List<Integer> secondlargestNumber = new ArrayList<Integer>(num);
		System.out.println(secondlargestNumber.get(secondlargestNumber.size()-2));
	}
}
