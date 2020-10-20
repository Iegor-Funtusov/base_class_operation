package ua.com.alevel.planet;

import ua.com.alevel.enums.PlanetEnum;

/**
 * @author Iehor Funtusov, created 16/10/2020 - 7:24 PM
 */
public class Mars extends BasePlanet {

    private PlanetEnum planetEnum;

    private Mars(Mars planet) {
        super(planet);
    }

    public Mars() {
    }

    @Override
    public PlanetEnum getPlanet() {
        return PlanetEnum.MARS;
    }

    @Override
    public int position() {
        return 4;
    }

    @Override
    public String toString() {
        return "Mars{}";
    }

    @Override
    public Mars getCurrentPlanet() {
        return this;
    }

    @Override
    public void setCurrentPlanet(Planet planet) {  // not Mars, only Planet
        if (planet instanceof Mars) {
            System.out.println("planet is a Mars");
        } else {
            System.out.println("planet is`t Mars");
            return;
        }
        Mars mars = (Mars) planet;
        System.out.println("mars = " + mars);

        if (planet.getClass().isAssignableFrom(Mars.class)) {
            System.out.println("planet is a Mars");
        } else {
            System.out.println("planet is`t Mars");
            return;
        }
        if (Mars.class.isAssignableFrom(planet.getClass())) {
            System.out.println("planet is a Mars");
        } else {
            System.out.println("planet is`t Mars");
            return;
        }
        mars = (Mars) planet;
        System.out.println("mars = " + mars);
    }
}
