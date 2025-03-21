package Lab3;

public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }

    public void printCar(){
      super.printInfo();
      System.out.println("is Electric?: " + electric + "\nhas discount?: " + discountApplied);
    }
    
    public boolean dropOffPassengers(int numOut){
      if(numOut<getPassengers()){
          setPassengers(getPassengers() - numOut);
          return true;
      }
      return false; 
    }

    public void applyDiscount(){
      if(!discountApplied && isElectric()){
        setTollFee((double)getTollFee() * 0.5);
        discountApplied = true;
      }
    }

    @Override
    public double calculateTollPrice(){
      return getPassengers() >= 4 ? 4.0 * getTollFee() : super.calculateTollPrice();
    }
  }