//InterfaceExample.java
interface Printable{  
		void print();   
}  
interface Showable extends Printable{  
		void show(); 
}  
class InterfaceExample implements Showable{  
	public void print(){
		System.out.println("Interface Printable example.");}  
	public void show(){
		System.out.println("Interface Showable example.");	}  

	public static void main(String args[]){  
		InterfaceExample obj = new InterfaceExample();  
		obj.print();   
		obj.show();  
	}  
}  

