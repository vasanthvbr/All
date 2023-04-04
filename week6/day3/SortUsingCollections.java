package week6.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {
	public static void main(String[] args) {
		List <String> name = new ArrayList<String>();
		
		name.add("Hcl");
		name.add("Wipro");
		name.add("Aspire System");
		name.add("CTS");
		
		System.out.println(name.size());
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
		
		name.remove(2);
		System.out.println(name);
		
		name.remove("Hcl");
		System.out.println(name);
		
		name.clear();
		System.out.println(name);
		
		
	}
}
