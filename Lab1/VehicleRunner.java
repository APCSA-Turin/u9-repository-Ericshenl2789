public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----

        Bicycle bike = new Bicycle(3, 2, "Bike");
        System.out.println(bike.getName());
        System.out.println(bike.getWheels());
        System.out.println(bike.getGearCount());
        bike.move(5);
        bike.turn();
        bike.brake();
        bike.ringBell();

        //Plane

        Plane plane = new Plane("Boeing 737", 6, 2);
        System.out.println(plane.getName());
        System.out.println(plane.getWheels());
        System.out.println(plane.getWings());
        plane.takeOff();
        plane.move(1000);
        plane.turn();
        plane.land();
        plane.brake();
    }
}