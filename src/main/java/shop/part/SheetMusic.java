package shop.part;
import shop.Item;

public class SheetMusic extends Item {

    // Instance Variables
    private String pitch;

    // Constructor

    public SheetMusic(int buyingPrice, int sellingPrice, String itemName, String pitch) {
        super(buyingPrice, sellingPrice, itemName);
        this.pitch = pitch;
    }

    // Getter
    public String getPitch() {
        return pitch;
    }
}
