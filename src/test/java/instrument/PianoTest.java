package instrument;

import org.junit.Before;
import org.junit.Test;
import shop.instrument.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(50, 60,"Metal","Black","Electric", "Sony", "Piano");
    }

    @Test
    public void canGetGuitarDetails(){
        assertEquals(50, piano.getBuyingPrice());
        assertEquals(60, piano.getSellingPrice());
        assertEquals("Piano", piano.getItemName());
        assertEquals("Black", piano.getColor());
        assertEquals("Metal", piano.getMaterial());
        assertEquals("Electric", piano.getType());
        assertEquals("Sony", piano.getBrand());
    }

    @Test
    public void canplay(){
        assertEquals("Piano", piano.play());
    }

    @Test
    public void calculateMarkUp(){
        assertEquals(10, piano.calculateMarkUp());
    }

}
