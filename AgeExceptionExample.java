//AgeExceptionExample.java
import java.lang.Exception;
class myException extends Exception {
	private int age;
	myException(int a){
		age=a;}
	public String toString(){
		return "Age is less then 18. Age: ["+ age +"]"; }
}// end of class

class AgeExceptionExample{
	static void setAge(int Age) throws myException{
		System.out.print("Input age is " + Age );
		if(Age < 18 )
		    throw new myException(Age);
		System.out.println("  Normal Execution.");	
	}
	public static void main(String [] args){
		try{
			setAge(50);
			setAge(15);}
		catch(myException me){
			System.out.println("  Exception Caught:  "+ me);}
	}// end of main function
}// end of class
