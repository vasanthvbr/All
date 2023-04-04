package week2.day2;

public class WhatsApp {

	public void sendMsg()
	{
		System.out.println("Send the Message");
	}
	public void uploadStatus()
	{
		System.out.println("Upload Status");
	}
	public void sendphoto() 
	{
		System.out.println("Sharing the Photo");
	}
	public void sendPayment() 
	{
		System.out.println("Sending Payment to Others");
	}
	public void shareDocument()
	{
		System.out.println("Share the Document");
	}
	public void shareLocation() 
	{
		System.out.println("Share the live Location");
	}
	public static void main(String[] args)
	{
		WhatsApp myApp = new WhatsApp();
		myApp.sendMsg();
		myApp.uploadStatus();
		myApp.shareDocument();
		myApp.sendphoto();
		myApp.sendPayment();
		myApp.shareLocation();
		
	}
	
}
