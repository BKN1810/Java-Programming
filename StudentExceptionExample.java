//StudentExceptionExample.java
import java.lang.Exception;
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message); }
}// end of class StudentNotFoundException
class StudentManager {
    public String find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("3456")) {
			return "Student ID Found." ; } 
		else {
			throw new StudentNotFoundException("ID Not Found: " + studentID); }
    }
}// end of class StudentManager
public class StudentExceptionExample {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
         try {
            String msg = manager.find("123456");
			System.out.println(msg);	
			msg = manager.find("23456");}
    	 catch (StudentNotFoundException ex) {
            System.out.println(ex);}
    }
}// end of class StudentExceptionExample
