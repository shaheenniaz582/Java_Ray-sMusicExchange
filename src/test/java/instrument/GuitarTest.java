package instrument;
import org.junit.Before;
import org.junit.Test;
import shop.instrument.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(10, 12,"Silver","Brown","String", 1,"Guitar");
    }

    @Test
    public void canGetGuitarDetails(){
        assertEquals(10, guitar.getBuyingPrice());
        assertEquals(12, guitar.getSellingPrice());
        assertEquals("Guitar", guitar.getItemName());
        assertEquals("Brown", guitar.getColor());
        assertEquals("Silver", guitar.getMaterial());
        assertEquals("String", guitar.getType());
        assertEquals(1, guitar.getTuning());
    }

    @Test
    public void canplay(){
        assertEquals("Guitar", guitar.play());
    }

    @Test
    public void calculateMarkUp(){
        assertEquals(2, guitar.calculateMarkUp());
    }


}

// r(int buyingPrice, int sellingPrice, String material, String color, String type, int tuning,String itemName)