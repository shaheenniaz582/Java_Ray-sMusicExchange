package parts;

import org.junit.Before;
import org.junit.Test;
import shop.part.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(10, 12,"Guitar Strings", 2);
    }

    @Test
    public void canGetDetailOfGuitarStrings(){
        assertEquals(10, guitarStrings.getBuyingPrice());
        assertEquals(12, guitarStrings.getSellingPrice());
        assertEquals("Guitar Strings", guitarStrings.getItemName());
        assertEquals(2, guitarStrings.getGuage());
    }
    @Test
    public void canCalculateMarkUp(){
        assertEquals(2,guitarStrings.calculateMarkUp());
    }
}
