package week6.day4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class MissingElaments {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,7,2,5,8,9};
		//output = 6
		
		Set<Integer> number = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			
			number.add(num[i]);
		}
		
		System.out.println(number);
		
		List<Integer> missingNumber = new ArrayList<Integer>(number);
		
		for (int i = 0; i < missingNumber.size(); i++) {
			
			if(missingNumber.get(i) != i + 1) {
			
			System.out.println(i+1);
			break;
			
			
		}
	}
	}
}
