// ObjectInitializeEx.java
class ObjectInitializeEx { 
    String name;   int rollNo;  // instance variables
	
    ObjectInitializeEx(){}
	
	ObjectInitializeEx(String name,int rollNo){ 
       this.name = name; this.rollNo = rollNo; } 
	   
	void setValue(String x, int y){ //instance method
          name=x; rollNo=y; } 
	   
    void display(){ //instance method
         System.out.println("Student's name:" +name); 
         System.out.println("Student's roll no: " +rollNo); } 

    public static void main(String[] args) { 
	System.out.println("object initialization By using constructor");
    ObjectInitializeEx obj1 = new ObjectInitializeEx("Ram Sharma",205); 
	obj1.display();
	
	System.out.println("Object Initialization by using Reference variable");
	ObjectInitializeEx obj2 = new ObjectInitializeEx(); 
	obj2.name="Hari Sharma"; obj2.rollNo=305;
	obj2.display();
	
	System.out.println("Object Initialization by using Method");
	ObjectInitializeEx obj3 = new ObjectInitializeEx(); 
	obj3.setValue("Shyam Sharma",310);
	obj3.display();
    } // main function end
}// class end
