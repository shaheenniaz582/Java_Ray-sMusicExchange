package shop.instrument;

import shop.behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    // Instance Variables
    private String brand;

    // Constructor

    public Piano(int buyingPrice, int sellingPrice, String material, String color, String type, String brand,String itemName) {
        super(buyingPrice, sellingPrice, material, color, type, itemName);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    // Methods
    public String play(){
        return "Piano";
    }
}
