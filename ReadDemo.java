import java.util.Scanner;
class ReadDemo {
	public static void main(String args[]){
		// Using Scanner for Getting Input from User
		Scanner in = new Scanner(System.in);

		System.out.println("Enter string: ");
		String s = in.nextLine();
		System.out.println("You entered string " + s);

		System.out.println("Enter Integer ");
		int a = in.nextInt();
		System.out.println("You entered integer " + a);

		System.out.println("Enter Float");
		float b = in.nextFloat();
		System.out.println("You entered float " + b);
	}
}
