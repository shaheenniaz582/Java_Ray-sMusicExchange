package parts;

import org.junit.Before;
import org.junit.Test;
import shop.part.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(20,22,"SheetMusic","Low");
    }

    @Test
    public void canGetDescriptionOfMusicSheet(){
        assertEquals(20,sheetMusic.getBuyingPrice());
        assertEquals(22, sheetMusic.getSellingPrice());
        assertEquals("SheetMusic",sheetMusic.getItemName());
        assertEquals("Low", sheetMusic.getPitch());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(2,sheetMusic.calculateMarkUp());
    }

}
