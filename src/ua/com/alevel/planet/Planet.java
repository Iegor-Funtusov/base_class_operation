package ua.com.alevel.planet;

/**
 * @author Iehor Funtusov, created 16/10/2020 - 7:24 PM
 */

public abstract class Planet {

    public abstract int position();

    public abstract Planet getCurrentPlanet();

    public abstract void setCurrentPlanet(Planet planet);
}
