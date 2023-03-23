//ExceptionFinallyBlock.java
import java.util.*;
class ExceptionFinallyBlock {
  public static void main(String[] args) {
	try {
		 Scanner in=new Scanner(System.in);
		 System.out.print("Enter Number: ");
		 int num=in.nextInt();
		 int x= 100 / num;
		 } catch(NumberFormatException | ArithmeticException e) {
			System.out.println("Exception =====>" + e.getMessage());
		 
		}
		finally {
			System.out.println("Finally block is always executed."); }
	}
}
