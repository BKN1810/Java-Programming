// " Student1.java"
class Student1{  
	int crn;	String name;  
	
	void setData(int x, String y){
	  crn=x;   name=y;}
	  
	public static void main(String args[]){  
		Student1 S1=new Student1();
		
		S1.setData(101,"Ram Sharma");
		System.out.println("Name: "+S1.name);  
		System.out.println("Roll Num: "+S1.crn);
	}  
}  

