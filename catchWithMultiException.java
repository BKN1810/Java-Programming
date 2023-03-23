//catchWithMultiException.java
import java.util.*;
public class catchWithMultiException {
  public static void main(String[] args) {
	    try {
				Scanner in=new Scanner(System.in);
				System.out.print("Enter b: ");
				int b=in.nextInt();
				int[] array = new int[5];
				array[5] = 30 /b; // if b=0, divide by zero exception.
				System.out.println(array[8]);
			}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Arithmetic Exception ==> "+ e.getMessage());
			}
	   System.out.println("Rest code");
	}
}
