package shop.part;
import shop.Item;

public class GuitarStrings extends Item {

    // instance Variables
    private int guage;

    // Constructor
    public GuitarStrings(int buyingPrice, int sellingPrice, String itemName, int guage) {
        super(buyingPrice, sellingPrice, itemName);
        this.guage = guage;
    }

    // Getter
    public int getGuage() {
        return guage;
    }
}
