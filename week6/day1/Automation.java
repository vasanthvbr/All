package week6.day1;

public class Automation extends MultipleLangauge implements Language, TestTool  {
	public static void main(String[] args) {
		Automation auto = new Automation();
		
		auto.python();
		auto.Selenium();
		auto.ruby();
		auto.java();
	}


@Override
public void ruby() {
	// TODO Auto-generated method stub
	System.out.println("Ruby");
}

public void Selenium() {
	// TODO Auto-generated method stub
	System.out.println("Selenium");
}

public void java() {
	// TODO Auto-generated method stub
	System.out.println("Java");
}
}