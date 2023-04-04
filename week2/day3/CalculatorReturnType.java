package week2.day3;

public class CalculatorReturnType
{
	public int addTwoNumber(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public int subTwoNumber(int sum, int b)
	{
		int d=sum-b;
		return d;
	}
	public void multTwoNumber(int Total, int b)
	{
		int e=Total *b;
		System.out.println(e);
	}

	public static void main(String[] args)
	{
		CalculatorReturnType calc=new CalculatorReturnType();
		int Sum = calc.addTwoNumber(15, 45);
		System.out.println(Sum);
		int Total = calc.subTwoNumber(Sum, 20);
		System.out.println(Total);
		calc.multTwoNumber(Total, 15);
		
		
	}
}
