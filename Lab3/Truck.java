package Lab3;

public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public int getAxles() {
    return axles;
  }

  public boolean hasTrailer() {
    return hasTrailer;
  }

  public void printTruck(){
    printInfo();
    System.out.println("Axle Number: " + axles + "\nTrailer?: " + hasTrailer);
  }

  public boolean validateLicensePlate(){
    if(hasTrailer){
      if(axles > 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")){
        return true;
      } if(axles <= 4 &&getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")){
        return true;
      }
      return false;
    }
    return true;
  }

  @Override
  public double calculateTollPrice(){
    double total = axles * getTollFee();
    return hasTrailer ? total * 2 : total;
  }
}