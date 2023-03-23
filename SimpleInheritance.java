// SimpleInheritance.java
class Vehicle {
    void run(){
        System.out.println("It is Super Class: Vehicle");   }
}
class TwoWheeler extends Vehicle {
    void wheel(){
        System.out.println("It is Sub Class: Two Wheeler");
    }
}

class SimpleInheritance{
    public static void main(String args[]) {
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.run();
        twoWheeler.wheel();
    }
}

