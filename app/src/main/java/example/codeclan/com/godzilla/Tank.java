package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Tank extends HumanConstructs implements Destroyable {

    public Tank(String type, int healthValue) {
        super(type, healthValue);
    }

    public String die() {
        return "Oh no pan breed";
    }

    public int attack() {
        return 10;
    }

}


