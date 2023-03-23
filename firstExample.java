// Documentation Section
/* An Example of a Java program for the addition of two numbers and reading numbers from user. */
//firstExample.java
import java.util.Scanner;
class firstExample {
	public static void addTwoNumbers(int a, int b){
		int c= a + b;
		System.out.print("Sum of two numbers is: " + c);
	}
	public static void main (String []args) {             
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a =sc.nextInt(); 
		System.out.print("Enter the second number: ");
		int b =sc.nextInt();
		
		//addTwoNumbers(a,b);
		firstExample obj=new firstExample();
		obj.addTwoNumbers(a,b);
	} // end of main class
} // end of class
