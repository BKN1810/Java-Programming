// StaticBlocks.java
class StaticBlocks {
	static int ID;   static String name; 
  
	static { // Static Block one
		System.out.println("First Static Block:");
		ID = 1505;   name = "WRC";  }
  	static { // Static Block two
		System.out.println("Second Static Block:");
		ID = 1210; 	name = "PCM"; }
	static { // Static Block three
		System.out.println("Third Static Block:");
		ID = 1200; 	name = "PN"; }
	
	public static void main(String[] args) {
		System.out.println("Static Number: " + ID);
		System.out.println("Static String: " + name);
	}
}

