package Lab3;

public class VehicleRunner {
    public static void main(String[] args) {
      Vehicle a = new Vehicle("A", 2.5, 4);
      a.clean();
      Car b = new Car("B", 1.5, 3, false);
      b.clean(); 
      Truck c = new Truck("C", 2, 34, 5, false);
      c.clean();
      Taxi cab = new Taxi("D", 1, 6, true, 2);
      cab.clean();
    }
}