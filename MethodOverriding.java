// MethodOverriding.java
class Animal {
   public void Display() {
      System.out.println("It is Base Class: Animal.");  }
}
class Dog extends Animal {
    public void Display() {
		//super.Display();//called base class function
		System.out.println("It is Derived Class: Dog.");
    }
}

class MethodOverriding {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Display();
   }
}


