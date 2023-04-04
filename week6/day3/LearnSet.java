package week6.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
	//Set<String> name = new HashSet<String>();
		
	Set<String> name = new TreeSet<String>();
	
	//Set<String> name = new LinkedHashSet<String>();
	
	name.add("Car");
	name.add("Ford");
	name.add("Accelecration");
	name.add("Dom");
	name.add("Email");
	boolean add = name.add("Bike");
	System.out.println(add);
	
	System.out.println(name);
	
	for (String LocalVariableName : name) {
		System.out.println(LocalVariableName);
	
			
		}
	}
	
	
}

