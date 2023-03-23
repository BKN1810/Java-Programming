//  Complex.java
class Complex {
    int a, b;
	Complex( int i, int j ){
        this.a = i;   this.b = j;  }
	Complex(int i){
        this(i, i); } // invokes the constructor with 2 parameters      

    Complex(){// invokes the constructor with single parameter
        this(0); }
    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";   }

    public static void main( String[] args ) {
        Complex c1 = new Complex(2, 3); 
        Complex c2 = new Complex(3);
        Complex c3 = new Complex();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
