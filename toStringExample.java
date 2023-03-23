//toStringExample.java
class Employee{
	int id;
	String name; String city;
	Employee(int id, String name, String city){
		this.id=id; this.name=name; this.city=city;
	}
	//overriding the toString() method
	public String toString(){
		return id +" "+ name +" "+ city;
    }
}// end of class Employee
class toStringExample{
	public static void main(String args[]){
		Employee e1=new Employee(101,"Ram Thapa","Kathmandu");
		Employee e2=new Employee(102,"Hari Sharma","Pokhara");
		System.out.println(e1);
		System.out.println(e2);
	}// end of main function
}// end of toStringExample
/*  The toString method is used to return a string representation of an object. 
If any object is printed, the toString() method is internally invoked by the java compiler. 
Else, the user implemented or overridden toString() method is called.  */