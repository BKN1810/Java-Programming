//boxingExample.java
class boxingExample{  
	public static void main(String args[]){  
		byte b = 100; //Primitive byte data
		Byte B = b; //Auto-Boxing of byte data
		System.out.println("Auto-Boxing of byte data: "+B);
    	int i = 200;    //Primitive int Data
		Integer I = i;  //Auto-Boxing of int data
		System.out.println("Auto-Boxing of int data: "+I);
  		long l = 250;   Long L = l;
		System.out.println("Auto-Boxing of long data: "+L);
		float f = 120L; Float F = f;
		System.out.println("Auto-Boxing of float data: "+F);
		double d = 18.58;   Double D = d;
		System.out.println("Auto-Boxing of double data: "+D);
		boolean bln = false; 	Boolean BLN = bln;
		System.out.println("Auto-Boxing of boolean data: "+BLN);
		char c = 'C';  	Character C = c;
		System.out.println("Auto-Boxing of Char data: "+C);
		 
		Integer I1 = 15;  //Integer Object
        int i1 = I1;  //Auto-Unboxing of Integer Object
        System.out.println("Auto-Unboxing of Interger data: "+i1); 
		Double D1 = 20.5; //Double Object
        double d1 = D1;  //Auto-Unboxing of Double Object
        System.out.println("Auto-Unboxing of Double data: "+d1);
		Character C1 = 'C';    //Character Object
        char c1 = C1; //Auto-Unboxing of Character Object
        System.out.println("Auto-Unboxing of Character data: "+c1);
    }// main function end   
}// end of class
