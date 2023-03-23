//MyExceptionExample.java
import java.lang.Exception;
class CustomException extends Exception {
	String message;
	CustomException(String str) {
		message = str;
    }
    public String toString() {
      return ("Custom Exception Occurred : " + message);
    }
}// end of class CustomException
public class MyExceptionExample {
	public static void main(String args[]) {
		try {
			throw new CustomException("This is a custom message"); } 
		 catch(CustomException e) {
			System.out.println(e); }
    }// end of main function
}// end of class MyExceptionExample 
