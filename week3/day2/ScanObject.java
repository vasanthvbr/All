package week3.day2;

import java.util.Scanner;

public class ScanObject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ener your name");
		String nextLine= scan.nextLine();
		char[] characters=nextLine.toCharArray();
		for (int i = characters.length-1; i>= 0 ; i--) {
			System.out.println(characters[i]);
	}
}
}
