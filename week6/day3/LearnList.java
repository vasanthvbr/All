package week6.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		
		num.add(20);
		num.add(10);
		num.add(30);
		num.add(50);
		num.add(40);
		
		System.out.println(num.size());
		
		System.out.println(num);
		
		Collections.sort(num);
		System.out.println(num);
		
		Collections.reverse(num);
		System.out.println(num);
		
		for (int i = 0; i < num.size(); i++) {
			Integer integer = num.get(i);
			System.out.println(integer);
		}
		
	}
}
