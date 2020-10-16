package ua.com.alevel.planet;

import ua.com.alevel.enums.PlanetEnum;

/**
 * @author Iehor Funtusov, created 16/10/2020 - 8:59 PM
 */

public abstract class BasePlanet extends Planet {

    public BasePlanet(Planet planet) {}
    public BasePlanet() {}

    public abstract PlanetEnum getPlanet();
}
