// MultilevelInheritance.java
class Vehicle {
    void run(){
        System.out.println("It is Super Class: Vehicle");   }
}
class TwoWheeler extends Vehicle {
    void wheel(){
        System.out.println("It is Sub Class: Two Wheeler");
    }
}
class MotorBike extends TwoWheeler{
    void fuel(){
        System.out.println("Fuel Required : Petrol");
    }
}
class MultilevelInheritance{
    public static void main(String args[]) {
        MotorBike motorBike = new MotorBike();
        motorBike.run();
        motorBike.wheel();
        motorBike.fuel();
    }
}

