package week5.day2;

public class Desktop extends Computer{
	    public void desktopSize(){
	        System.out.println("Desktop size");
	    }

	    public static void main(String[] args) {
	        Desktop computer = new Desktop();
	        computer.computerModel();
	        computer.desktopSize();
	    }
	}
