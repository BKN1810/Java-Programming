//UnCheckedExceptions.java
public class UnCheckedExceptions{
	public static void main(String [] args){
		try{
			int [] array={12,23,45,67,87};
			System.out.println(array[7]); }
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()); }
			
		try { 
		    int number1 = 5; int number2 = 0;
			int result= number1/number2;
             System.out.println(" Result: "+ result); }
        catch (ArithmeticException e) {
            System.out.println(e); }
		try {
			String str=null;
			if(str.equals("Name"))
				System.out.println("Same String");}
		catch(NullPointerException e){
			System.out.println(e); }
	}// end of main function
}// end of class
