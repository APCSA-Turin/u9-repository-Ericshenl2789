public class Bicycle extends Vehicle{
    private int gearCount;
    
    public Bicycle(int gearCount, int wheels, String name){
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public int getGearCount(){
        return gearCount;
    }

    public void ringBell(){
        System.out.println("Ding Ding");
    }
}