package week2.day2;

public class Laptop {

	String companyName = "hp";
	int modelNumber= 951365;
	short numberOfPiece = 15; 
	float laptopIpAddress = 19245.4566f;
	long serialNumber = 1593687479954l;
	double price = 59999.9999;
	boolean isDamage = false;
	char ram = '8';
	public static void main(String[] arg)
	{
		Laptop mylap=new Laptop();
		System.out.println("Brand="+mylap.companyName);
		System.out.println("modelNumber="+mylap.modelNumber);
		System.out.println("numberOfPiece="+mylap.numberOfPiece);
		System.out.println("laptopIpAdress="+mylap.laptopIpAddress);
		System.out.println("serialNumber="+mylap.serialNumber);
		System.out.println("price="+mylap.price);
		System.out.println("isDamage="+mylap.isDamage);
		System.out.println("ram="+mylap.ram);
	}
	
	
}
