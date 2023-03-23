//Variables.java
class Variables{
    static int age; // static or class variables
	float salary=1098; /// Instance variables
	
	int sum(int a, int b){
	   int x=a,y=b; // local variables
	   return x+y;
		}
	public static void main(String[] args){
		Variables var = new Variables();
		age=32;
		int z=var.sum(10,23);
		System.out.println("Sum of Local Variables: " + z);
		System.out.println("Instance Variables: " + var.salary);
		System.out.println("Static Variables: " + age); //accessing static variables
		
		Variables var1 = new Variables();
		z=var1.sum(23,45);
		var1.salary=233443;
		System.out.println("Sum of Local Variables: " + z);
		System.out.println("Instance Variables: " + var1.salary);
		System.out.println("Static Variables: " + age); //accessing static variables
	}
}
