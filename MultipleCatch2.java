//MultipleCatch2.java
import java.util.*;
public class MultipleCatch2 {
  public static void main(String[] args) {
	    try {
				Scanner in=new Scanner(System.in);
				System.out.print("Enter b: ");
				int b=in.nextInt();
				int[] array = new int[5];
				array[5] = 30 /b; // if b=0, divide by zero exception.
				System.out.println(array[8]);
			}
		catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception");
			}
	    catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBounds");
			}
	    catch(java.lang.Exception e) {
				System.out.println("Parent Exception");
			}
		System.out.println("Rest code");
	}
}
