package ua.com.alevel.planet;

/**
 * @author Iehor Funtusov, created 16/10/2020 - 8:08 PM
 */

public class PlanetPrinter {

    private Planet planet;

    public PlanetPrinter(Planet planet) {
        this.planet = planet;
    }

    public void print() {
        System.out.println("planet = " + planet.toString());
    }

    public Planet getPlanet() {
        return this.planet;
    }
}
