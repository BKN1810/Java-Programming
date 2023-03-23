//AbstractBank.java
abstract class Bank{    
	abstract int getRateOfInterest();    
 }    
class SBI extends Bank{    
		int getRateOfInterest(){return 7; }    
 }    
class PNB extends Bank{    
		int getRateOfInterest(){return 8;}    
}    
  
class AbstractBank{    
	public static void main(String args[]){    
		Bank b=new SBI();
		int interest=b.getRateOfInterest();    
		System.out.println("Rate of Interest is: "+interest+" %");    
		
		Bank d=new PNB();
		interest=d.getRateOfInterest();    
		System.out.println("Rate of Interest is: "+interest+" %");    
	}
}  
  
