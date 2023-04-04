package week2.day3;

public class Calculator {
	public void subtractTwoNumber(int a , int b)
	{
		int c = a-b;
		System.out.println(c);
	}
	public void multiplicationTwoNumber(int a , int b)
	{
		int d = a*b;
		System.out.println(d);
	}
	public void divisionTwoNumber(int a , int b)
	{
		int e = a/b;
		System.out.println(e);
	}
	public static void main(String[] args)
	{
		Calculator calc=new Calculator();
		calc.subtractTwoNumber(61, 31);
		calc.subtractTwoNumber(30, 15);
		calc.multiplicationTwoNumber(61, 31);
		calc.multiplicationTwoNumber(30, 15);
		calc.divisionTwoNumber(61, 31);
		calc.divisionTwoNumber(30, 15);
	}

}
