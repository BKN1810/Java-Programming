//"DefaultConstructor.java"
class DefaultConstructor {
	String name;
	DefaultConstructor() {
		System.out.println("DefaultConstructor Called:");
		name = "Default Constructor";
	  }
	
	public static void main(String[] args) {
		// constructor is invoked while  creating an object of the DefaultConstructor class
		DefaultConstructor obj = new DefaultConstructor();
		System.out.print("Name is " + obj.name);
	}
}