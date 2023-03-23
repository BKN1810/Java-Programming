// HierarchicalInheritance.java
class Vehicle {
    void run(){
        System.out.println("It is Super Class: Vehicle");   }
}
class TwoWheeler extends Vehicle {
    void wheel(){
        System.out.println("It is Derived Class: Two Wheeler");
    }
}
class FourWheeler extends Vehicle{
    void wheel(){
        System.out.println("It is Derived Class:Four Wheeler");
    }
}
class HierarchicalInheritance{
    public static void main(String args[]) {
        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.run();
        fourWheeler.wheel();

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.run();
        twoWheeler.wheel();
    }
}



