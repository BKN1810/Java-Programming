// thisExample.java
class thisExample {
	String name;
	void setName( String name ) {
       this.name = name;}

    String getName()  { return this.name;   }

	public static void main( String[] args ) {
		thisExample obj = new thisExample();
		obj.setName("Core Java");
		System.out.println("obj.name: "+obj.getName());
   }
}
