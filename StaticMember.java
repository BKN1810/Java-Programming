//Program to change  the common property of all objects (static field).  
// StaticMember.java
class Student{  
	int rollno;  String name;  
	static String college = "WRC";  
	       
	static void change(){  
	     college = "PCM"; }  
	  
    Student(int r, String n){  
     rollno = r;  name = n; }  
	  
	void display (){
		System.out.println(rollno +" "+ name +" "+ college); } 
}
class StaticMember{
	public static void main(String args[]){  
		Student s1 = new Student (931,"Kiran");  
	    Student s2 = new Student (732,"Bimal");  
		s1.display();   s2.display();  
		Student.change();  
		s1.display();   s2.display();  
		
	}  
}  



