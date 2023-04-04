package week5.day4;

public class Employee {
	public void getEmployeeDetails(int empId) {
	System.out.println(empId);	
	}
	public void getEmploydetails(long empMobileNumber) {
		System.out.println(empMobileNumber);
	}
	public void getEmploydetails(String empMailId) {
		System.out.println(empMailId);
}
	public static void main(String[] args) {
		Employee empl = new Employee();
		empl.getEmployeeDetails(1463250);
		empl.getEmploydetails("Vasanthkumar4621");
		empl.getEmploydetails(7358065608l);
	}
}