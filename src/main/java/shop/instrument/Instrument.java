package shop.instrument;
import shop.Item;

public abstract class Instrument extends Item  {

    //Instance Variables
    private String material;
    private String color;
    private String type;

    //Constructor

    public Instrument(int buyingPrice, int sellingPrice, String material, String color, String type,String itemName) {
        super(buyingPrice, sellingPrice, itemName);
        this.material = material;
        this.color = color;
        this.type = type;
    }

    // Getter

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

}
