package Lab2;

public class Cat extends Animal{
    private boolean played;
    private boolean washed;
    
    public Cat(String name, int age){
        super(name, age);
        played = false;
        washed = false;
    }

    public boolean hasPlayedWith() {
        return played;
    }
    
    public boolean isWashed() {
        return washed;
    }

    public void play(){
        played = true;
        System.out.println(getName() + " is content. ");
    }

    public void wash(){
        washed = true; 
        System.out.println("Meeorrw!");
    }
}
