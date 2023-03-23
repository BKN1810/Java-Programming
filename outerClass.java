//outerClass.java
class outerClass {
	int out;
	void setDataOut(int x){
		out=x; }
	// nested inner class
	class innerClass {
		int in;
		void setDataIn(int x){
			in=x;  }
		public void show(){
			System.out.println("From Inner Class Method: ");
			System.out.println("\tout= "+ out+ "\n\tin= "+ in);
		}
	} // end of inner class.
 	public static void main(String[] args){
		outerClass myOuter = new outerClass();
		outerClass.innerClass myInner = myOuter.new innerClass();
		myOuter.setDataOut(100);     myInner.setDataIn(200);  myInner.show();
		System.out.print("out + in = ");
		System.out.println( myOuter.out + myInner.in);
	}
}// end of outer class
