//ownExceptionExample.java
import java.lang.Exception;
class myException extends Exception {
	private int detail;
	myException(int a){
		detail=a;}
	public String toString(){
		return "MyException ["+ detail+"]"; }
}// end of class

class ownExceptionExample{
	static void compute(int a) throws myException{
		System.out.print("Called compute (" +a+ ")");
		if(a>100)
		    throw new myException(a);
		System.out.println("  Normal Execution.");	
	}
	public static void main(String [] args){
		try{
			compute(50);
			compute(123);}
		catch(myException me){
			System.out.println("  Exception Caught "+ me);}
	}// end of main function
}// end of class
