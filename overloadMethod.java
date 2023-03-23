//overloadMethod.java
public class overloadMethod {
	int sum(int x, int y) { 
		return (x + y); }

	int sum(int x, int y, int z){
		return (x + y + z); }

	double sum(double x, double y){
		return (x + y);}

	public static void main(String args[]){
		overloadMethod  s = new overloadMethod ();
		System.out.println(s.sum(100, 200));
		System.out.println(s.sum(100, 200, 380));
		System.out.println(s.sum(105.5, 260.5));
	}
}
