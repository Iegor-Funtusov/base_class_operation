package ua.com.alevel.planet;

import ua.com.alevel.enums.PlanetEnum;

/**
 * @author Iehor Funtusov, created 16/10/2020 - 7:24 PM
 */
public class Saturn extends BasePlanet {

    public Saturn(Saturn planet) {
        super(planet);
    }

    public Saturn() {
    }

    @Override
    public PlanetEnum getPlanet() {
        return PlanetEnum.SATURN;
    }

    @Override
    public int position() {
        return 6;
    }

    @Override
    public String toString() {
        return "Saturn{}";
    }

    @Override
    public Saturn getCurrentPlanet() {
        return this;
    }

    @Override
    public void setCurrentPlanet(Planet planet) {

    }
}
