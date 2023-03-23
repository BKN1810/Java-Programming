//addTwoNum.java
import java.util.Scanner;
public class addTwoNum{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter Num: ");
		int num1= in.nextInt();
		
		System.out.print("Enter another Number ");
		int num2= in.nextInt();
		
		int sum=num1+num2;
		
		System.out.print("Sum of Numbers: "+sum);
		
	}// main end
}// class end
