//StaticExample.java
import java.io.*;
public class StaticExample {
    static int num = 100;
    static String str = "Static Variable";
	int b = 50;  // instance variable
    
    static void display() { // This is Static method
        System.out.println("Accessing Static data: " + num);
        System.out.println("Accessing Static data: " + str); }
		// System.out.println("Accessing Non-Static data: " + b);}
  
    void nonstatic() { // non-static method
        System.out.println("Accessing Static data: " + num);
        System.out.println("Accessing Static data: " + str); 
		System.out.println("Accessing Non-Static data: " + b);  }
  
    public static void main(String args[]) {
        StaticExample obj = new StaticExample();
        // This is object to call non static function
        obj.nonstatic();
        // static method can called  directly without an object
        display();
    }
}
