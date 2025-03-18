public class Planet {
    private String name;
    private int radius;
    private String typeOfPlanet;
    private int moonNumber;

    public Planet(String name, int radius, String typeOfPlanet, int moonNumber){
        this.name = name;
        this.radius = radius;
        this.typeOfPlanet = typeOfPlanet;
        this.moonNumber = moonNumber;
    }

    public int getMoonNumber() {
        return moonNumber;
    }
    public String getName() {
        return name;
    }
    public int getRadius() {
        return radius;
    }
    public String getTypeOfPlanet() {
        return typeOfPlanet;
    }


    public void rotate(){
        System.out.println("rotated");
    }

    public void orbit(){
        System.out.println("One revolution complete.");
    }
}
