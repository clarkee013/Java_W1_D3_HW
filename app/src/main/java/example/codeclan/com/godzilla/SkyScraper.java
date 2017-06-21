package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class SkyScraper extends HumanConstructs implements Destroyable {

    public SkyScraper(String type, int healthValue) {
        super(type, healthValue);
    }

    public String die() {
        return "Oh no barney rubble";
    }

    public int attack() {
        return 20;
    }


public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public String destroy() {
        return "Kabooooooooom";
    }
}


