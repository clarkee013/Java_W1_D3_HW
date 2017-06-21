package example.codeclan.com.godzilla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/06/2017.
 */

public class MothraTest {

    Mothra mothra;

    @Before
    public void before(){
        mothra = new Mothra("Bernie", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Bernie", mothra.getName());
    }

    @Test
    public void canRoar(){
        assertEquals(mothra.roar(), "Roooooaooooaaaaaaaaar!!!");
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(mothra.getHealthValue(), 100);
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(mothra.getDestructiveForce(), 50);
    }
}
