package week2.day2;

public class Mobile {

	    public void switchOnMobile(){
	        System.out.println("Switch on the mobile");
	    }
	    public void plugInCharger(){
	        System.out.println("Plug in the charger");
	    }
	    public void unLockMobile(){
	        System.out.println("Unlock mobile");
	    }
	    public void insertSimCard(){
	        System.out.println("Insert sim card ");
	    }
	    public void logIn(){
	        System.out.println("Login using Gmail ID");
	    }
	    public void sync(){
	        System.out.println("Sync device");
	    }
	    public void call(){
	    	
	    	System.out.println("Call");
	    }

	    public static void main(String[] args) {
	        Mobile myphn = new Mobile();
	        myphn.logIn();
	        myphn.switchOnMobile();
	        myphn.plugInCharger();
	        myphn.unLockMobile();
	        myphn.insertSimCard();
	        myphn.sync();
	        myphn.call();
	    }
	}	

