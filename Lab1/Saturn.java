public class Saturn extends Planet{
    private boolean rings;

    public Saturn(String name, int radius, String typeOfPlanet, int moonNumber, boolean rings){
        super(name, radius, typeOfPlanet, moonNumber);
        this.rings = rings;
    }

    public boolean hasRings(){
        return rings;
    }

    public void hexagonalNorthPole(){
        System.out.println("The clouds are still there");
    }
}
