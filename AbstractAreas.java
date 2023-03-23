//AbstractAreas.java
abstract class Figure {
	double dim1; double dim2;
	Figure(double a, double b) {
		dim1 = a; dim2 = b; }
	// area is now an abstract method
	abstract double area();
}// end of class Figure

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b); }
	// override area for rectangle
	double area() {
		System.out.println("From the Rectangle class. ");
		return dim1 * dim2; }
}// end of class Rectangle

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);}
	// override area for right triangle
	double area() {
		System.out.println("From the Triangle class. ");
		return dim1 * dim2 / 2;}
}// end of class Triangle

class AbstractAreas {
	public static void main(String args[]) {
		// Figure f = new Figure(10, 10); // illegal now
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		
		Figure fig; // this is OK, no object is created
		fig = r;// run time polumorphism
		System.out.println("Area is " + fig.area());
		fig = t;// run time polumorphism
		System.out.println("Area is " + fig.area());
	}
}
