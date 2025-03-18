public class PlanetRunner{
    public static void main(String[] args) {
        Planet p = new Planet("Mercury", 1516, "Rock", 0);
        System.out.println(p.getName());
        System.out.println(p.getRadius());
        System.out.println(p.getTypeOfPlanet());
        System.out.println(p.getMoonNumber());
        p.rotate();
        p.orbit();

        Earth a = new Earth("Earth", 3963, 1, "Rock", true);
        System.out.println(a.getName());
        System.out.println(a.getRadius());
        System.out.println(a.getTypeOfPlanet());
        System.out.println(a.getMoonNumber());
        System.out.println(a.getPopulation());
        a.rotate();
        a.orbit();
        a.moveTectonicPlates();

        Saturn ba = new Saturn("Saturn", 60268, "Gas", 274, true);
        System.out.println(ba.getName());
        System.out.println(ba.getRadius());
        System.out.println(ba.getTypeOfPlanet());
        System.out.println(ba.getMoonNumber());
        System.out.println(ba.hasRings());
        ba.rotate();
        ba.orbit();
        ba.hexagonalNorthPole();
    }
}