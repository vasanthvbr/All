package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 165984321;
	boolean isPunctured = false;
	String bikeName = "Rs200";
	double runningKm = 1095.25;
public static void main(String[] args) 
{
	TwoWheeler myBike =new TwoWheeler();
	System.out.println(myBike.bikeName);
	System.out.println("chassisNumber=" +myBike.chassisNumber);
	System.out.println("isPunctured=" +myBike.isPunctured);
	System.out.println("runningKM= "+myBike.runningKm);
	System.out.println("noOfwheels="+myBike.noOfWheels);
	System.out.println("noOfMirrors="+myBike.noOfMirrors); 
		
	}
}
