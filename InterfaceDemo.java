// InterfaceDemo.java
interface Polygon {
	public static final int length = 4,breadth = 8;
	//declaring interface methods(without a method body)
	public void getName();
	public void getNumberOfSides();
	public void getArea();
	public void getPerimeter();
}
// Rectangle class "implements" the Polygon interface
class Rectangle implements Polygon {
	public void getName()   {
		System.out.println("The name of the Polygon is: Rectangle"); }
	public void getNumberOfSides(){
		System.out.println("There are 4 sides in a Rectangle"); }
	public void getArea(){
        System.out.println("The Area of Rectangle is: " +length*breadth); }
	public void getPerimeter(){
        System.out.println("The Perimeter of Rectangle is: " +2*(length + breadth)); }
}
class InterfaceDemo{
	public static void main(String[] args){
		Rectangle rectangle = new Rectangle(); // Create a Rectangle object
		//calling methods of class Rectangle
		rectangle.getName();
		rectangle.getNumberOfSides();
		rectangle.getArea();
		rectangle.getPerimeter();
   }
}


