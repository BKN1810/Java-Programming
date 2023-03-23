// "OverloadedConstructor.java"
class Student{
	Student(String name){
		System.out.println("Constructor with one parameter: String: ");
		System.out.println("Name: " +name); }
		
	Student(int crn){
		System.out.println("Constructor with one parameter: Integer: ");
		System.out.println("Roll Number: " + crn); }
	
	Student(String name, int crn){
		System.out.println("Constructor with two parameters: String and Integer: ");
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + crn);}
}
public class OverloadedConstructor{
	public static void main (String[] args){
		Student obj1 = new Student("Ram Sharma");
		Student obj2 = new Student(112);
		Student obj3 = new Student("Ram Sharma", 112);
	}
}


