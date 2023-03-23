//ThrowExample.java
class ThrowExample {  
    //defining a method  
    public static void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else   
          System.out.println("Square of " + num + " is " + (num*num));  
         
    }  
    public static void main(String[] args) {  
        ThrowExample obj = new ThrowExample();  
        obj.checkNum(5);  
        System.out.println("Successful.");  
		obj.checkNum(-9);  
        System.out.println("Example of Throw.");  
    }  
}  