package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class SkyScraperTest {
    SkyScraper skyScraper;


    @Before
    public void before(){
        skyScraper = new SkyScraper("building", 30);
    }


    @Test
    public void hasType(){
        assertEquals("building", skyScraper.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(30, skyScraper.getHealthValue());
    }

    @Test
    public void canBeDestroyed(){
        assertEquals("Kabooooooooom", skyScraper.destroy());
    }
}
