public class Plane extends Vehicle{
    private int wings;

    public Plane(String name, int wheels, int wings){
        super(name, wheels);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void takeOff(){
        System.out.println("Flying in the air");
    }

    public void land(){
        System.out.println("A smooth landing");
    }
}
