// " Student.java"
class Student{  
	int crn;//field or data member or instance variable  
	String name;  
	public static void main(String args[]){  
		//Creating an object or instance  
		Student S1=new Student();//creating an object of Student  
		S1.crn=101;   
		S1.name="Ram Sharma";
				
		System.out.println("Name: "+S1.name);  
		System.out.println("Roll Num: "+S1.crn);
	}  
}  

