package Lab2;

public class Animal{
    private String name;
    private int age;
    private boolean isVaccinated;
    private int numberOfcheckUps;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        isVaccinated = false;
        numberOfcheckUps = 0;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfcheckUps() {
        return numberOfcheckUps;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void adopt(){
        System.out.println(name + " has been adopted. ");
    }

    public void feed(){
        System.out.println(name + " has been fed. ");
    }

    public void checkUp(){
        numberOfcheckUps++;
        System.out.println(name + " is looking healthy.");
    }
}