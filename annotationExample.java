//annotationExample.java
class Base{  
	void print(){
		System.out.println("I am Base Print method.");
	}  
}// end of base class 
class Derived extends Base{  
	@Override  
	void print(){
		System.out.println("I am Derived Print method.");
	}
}// end of derived class
class annotationExample{  
	public static void main(String args[]){  
		Derived obj=new Derived();  
		obj.print();  
	}// end of main function
}// end of main class



