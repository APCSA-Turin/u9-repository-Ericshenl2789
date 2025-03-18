package Lab2;

public class Dog extends Animal{
    private boolean walked;
    private boolean trained;

    public Dog(String name, int age){
        super(name, age);
        walked = false;
        trained = false;
    }

    public boolean hasBeenWalked(){
        return walked;
    }

    public boolean isTrained() {
        return trained;
    }

    public void walk(){
        walked = true;
        System.out.println(getName() + " has been walked. ");
    }

    public void train(){
        trained = true;
        System.out.println(getName() + " is ready to help!");
    }
}
