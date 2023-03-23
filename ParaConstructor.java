// "ParaConstructor.java"
class Student{
	String name;
	int crn;
	Student(String name, int crn){
		this.name = name;
		this.crn = crn;
	}
}
public class ParaConstructor{
	public static void main (String[] args){
		Student object = new Student("Ram Sharma", 105);
		System.out.println("Name: " + object.name );
		System.out.println("Roll Num: " + object.crn);
	
		Student object1 = new Student("Sita Sharma", 124);
		System.out.println("Name: " + object1.name );
		System.out.println("Roll Num: " + object1.crn);
	}
}

