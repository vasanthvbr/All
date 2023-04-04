package week5.day2;

public class Student extends Department {
    public void studentName(){
        System.out.println("Vasanth");
    }
    public void studentDept(){
        System.out.println("Mechanical");
    }
    public void studentId(){
        System.out.println("103");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.studentName();
        student.studentDept();
        student.studentId();
        
        student.deptNmae();
     
        student.collegeName();
        student.collegeCode();
        student.collegeRank();
    }
}