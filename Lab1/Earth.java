public class Earth extends Planet{
    private boolean population;

    public Earth(String name, int radius, int moonNumber, String typeOfPlane, boolean population){
        super(name, radius, typeOfPlane, moonNumber);
        this.population = population;
    }

    public boolean getPopulation() {
        return population;
    }

    public void moveTectonicPlates(){
        System.out.println("Earthquake dectected");
    }
}
