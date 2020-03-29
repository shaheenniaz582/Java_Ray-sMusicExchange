import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.instrument.Guitar;
import shop.instrument.Piano;
import shop.instrument.Trumpet;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar1;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;


    @Before
    public void before(){
        shop = new Shop();
        guitar1 = new Guitar(100, 120,"Silver","Brown","String", 1,"Guitar");
        guitar = new Guitar(10, 12,"Silver","Silver","String", 1,"Guitar");
        piano = new Piano(50, 60,"Metal","Black","Electric", "Sony", "Piano");
        trumpet = new Trumpet(100, 120,"Wood", "Brown", "Acoustic", 2,"Trumpet");
    }

    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitar1);
        shop.addItemToStock(piano);
        shop.addItemToStock(trumpet);
        assertEquals(4, shop.getStockCount());

    }
    @Test
    public void canRemoveFromStock(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitar1);
        shop.addItemToStock(piano);
        shop.addItemToStock(trumpet);
        shop.removeItemFromstock(guitar1);
        assertEquals(3,shop.getStockCount());
    }
}
