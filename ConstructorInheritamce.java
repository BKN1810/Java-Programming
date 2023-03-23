// ConstructorInheritamce.java
class Box {
	double width;  double height;  double depth;
	Box() { // use -1 to indicate an uninitialized box
		width = -1;  height = -1; depth = -1; 
		System.out.println("I am Base default constructor."); }

	Box(double w, double h, double d) {
		width = w;  height = h;  depth = d; }

	double volume() {
		return width * height * depth; }
}// end of Box class
class BoxWeight extends Box {
	double weight; // weight of box
	BoxWeight() {
		super();  weight = -1; 
		System.out.println("I am Derived default constructor.");}

	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor 
		weight = m; 
	}
}//end of BoxWeight class

class ConstructorInheritamce {
	public static void main(String args[]) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox3 = new BoxWeight(); // default
		
		double vol;
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);

		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is " + vol);
		System.out.println("Weight of mybox3 is " + mybox3.weight);
	}
}
