package shop.instrument;
import shop.behaviours.IPlay;


public class Guitar extends Instrument implements IPlay {

    // Instance Variables
    private int tuning;

    // Constructor
    public Guitar(int buyingPrice, int sellingPrice, String material, String color, String type, int tuning,String itemName) {
        super(buyingPrice, sellingPrice, material, color, type, itemName);
        this.tuning = tuning;
    }

    // Getter

    public int getTuning() {
        return tuning;
    }
    public String play(){
        return "Guitar";
    }
}
