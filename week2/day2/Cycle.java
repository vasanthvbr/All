package week2.day2;

public class Cycle {
 
	String brandName = "Hercules";
	int modelNumber= 469831;
	short numberOfPedal = 2; 
	long serialNumber = 686545321l;
	float tyrePressure= 15.69f;
	double price = 9999.999;
	boolean isDamage = false;
	char Colour = 'R';
	public static void main(String[] arg)
	{
		Cycle myclc=new Cycle();
		System.out.println("Brand="+myclc.brandName);
		System.out.println("modelNumber="+myclc.modelNumber);
		System.out.println("numberOfPiece="+myclc.numberOfPedal);
		System.out.println("serialNumber="+myclc.serialNumber);
		System.out.println("Tyre Pressure="+myclc.tyrePressure);
		System.out.println("Price="+myclc.price);
		System.out.println("isDamage="+myclc.isDamage);
		System.out.println("Colour="+myclc.Colour);
	}
	
}
