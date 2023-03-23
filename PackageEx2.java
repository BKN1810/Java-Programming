//PackageEx2.java
package university.tech.it;
import university.tech.*;    //importing all the classes
public class PackageEx2{
	public static void main(String args[]){ 
		String name = "It is Java Package Tutorial";
		// Creating an instance of class MyClass from another package.
		MyClass obj = new MyClass();
		obj.printName(name);
	}
}
//javac -d . PackageEx2.java
//java university.tech.it  PackageEx2

