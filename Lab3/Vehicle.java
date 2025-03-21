package Lab3;

public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
      this.licensePlate = licensePlate;
      this.tollFee = tollFee;
      this.passengers = passengers;
    }
  
    public String getLicensePlate() {
      return licensePlate;
    }
  
    public double getTollFee() {
      return tollFee;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setTollFee(double tollFee) {
        this.tollFee = tollFee;
    }
    
    public double calculateTollPrice() {
      return tollFee * passengers;
    }

    public void printInfo(){
      System.out.println("License: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\npassengers: " + getPassengers());
    }

    public void clean(){
      System.out.println("It is now nice and clean");
    }
  }