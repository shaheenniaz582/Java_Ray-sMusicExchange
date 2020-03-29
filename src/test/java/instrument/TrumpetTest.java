package instrument;

import org.junit.Before;
import org.junit.Test;
import shop.instrument.Trumpet;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(100, 120,"Wood", "Brown", "Acoustic", 2,"Trumpet");
    }

    @Test
    public void canGetTrumpetDetails(){
        assertEquals(100, trumpet.getBuyingPrice());
        assertEquals(120, trumpet.getSellingPrice());
        assertEquals("Trumpet", trumpet.getItemName());
        assertEquals("Brown", trumpet.getColor());
        assertEquals("Wood", trumpet.getMaterial());
        assertEquals("Acoustic", trumpet.getType());
        assertEquals(2, trumpet.getNoOfVolves());
    }

    @Test
    public void canplay(){
        assertEquals("Trumpet", trumpet.play());
    }

    @Test
    public void calculateMarkUp(){
        assertEquals(20, trumpet.calculateMarkUp());
    }
}
