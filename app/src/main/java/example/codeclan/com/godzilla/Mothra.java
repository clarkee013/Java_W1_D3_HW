package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Mothra extends Kaiju implements Attack {

    public Mothra(String name, int healthValue) {
        super(name, healthValue);
    }

    public int getDestructiveForce() {
        return 50;
    }

    public String roar() {
        return "Roooooaooooaaaaaaaaar!!!";
    }

    public String getName() {
        return name;
    }


    public int getHealthValue() {
        return healthValue;
    }

}
