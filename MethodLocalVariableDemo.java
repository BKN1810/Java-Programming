//MethodLocalVariableDemo.java
class Outer {
void outerMethod() {
	final int x=1000;
	System.out.println("From outer Method......");
	class Inner {
		void innerMethod() {
			System.out.println("x = "+x);
		}
	}// end of inner class
	Inner in = new Inner();
	in.innerMethod();
}
}
class MethodLocalVariableDemo {
	public static void main(String[] args){
	Outer x = new Outer();
	x.outerMethod();
	}
}
