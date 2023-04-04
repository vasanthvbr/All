package week2.day2;

public class Car {

	public void checkPetrol() {
		System.out.println("Check the petrol level");
	}
	public void turnOn() {
		System.out.println("Switch on the car");
	}
	public void handBrake() {
		System.out.println("Disengage the Hand Brake");	
	}
	public void turnOnAc() {
		System.out.println("Trun on the AC");
	}
	public void applyClutch() {
		System.out.println("Apply the Clutch");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void accelerate() {
		System.out.println("Accelerate the car");
	}
	public void applyBrake() {
		System.out.println("Apply Brake");
	}
	public void pressHorn() {
		System.out.println("Press the Horn");
	}
	public void putWiper() {
		System.out.println("Turn on the wiper");
	}
	public void turnOff() {
		System.out.println("Turn off the car");
	}
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.checkPetrol();
		myCar.turnOn();
		myCar.handBrake();
		myCar.turnOnAc();
		myCar.applyClutch();;
		myCar.applyGear();
		myCar.accelerate();
		myCar.applyBrake();
		myCar.pressHorn();
		myCar.putWiper();
		myCar.turnOff();
		
		
	}
}
