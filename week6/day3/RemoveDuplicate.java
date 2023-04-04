package week6.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,6,2,4};
		
		Set<Integer> number = new TreeSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			if(!number.add(num[i]))	
			System.out.println(num[i]);
		}
		
	
//		System.out.println(number);
//	
//		
//		
//	for (Integer integer : number) {
//		System.out.println(integer);
//		
//	}
//	
//	List<Integer> number1 = new ArrayList<Integer>(number);
//	
//	Integer min = Collections.min(number1);
//	System.out.println("min= "+min);
//	System.out.println("minimum= "+number1.get(0));
//	
//	Integer max = Collections.max(number1);
//	System.out.println("max= "+max);
//	System.out.println("maximum= "+number1.get(number.size()-1));
//	
}
}




