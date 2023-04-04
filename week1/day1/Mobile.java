package week1.day1;

public class Mobile {

	String mobileBrandName="oppo";
	char mobileLogo = 'o';
	short noOfMobilePiece = 20;
	int modeNumber = 9951235;
	long mobileImeiNumber = 753963456;
	float mobilePrice = 29999.99F;
	boolean isDamaged = false;
	public static void main(String[] arg)
	{
		Mobile mob=new Mobile();
		System.out.println(mob.mobileBrandName);
		System.out.println("Mobile logo ="+mob.mobileLogo);
		System.out.println("no.of mobile piece"+" = "+mob.noOfMobilePiece);
		System.out.println("Mobile IMEI number "+" ="+mob.mobileImeiNumber);
		System.out.println("Mobile price "+" = "+mob.mobilePrice);
		System.out.println("Damage "+" ="+mob.isDamaged);
	}
}
