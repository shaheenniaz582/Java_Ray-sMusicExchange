package shop.instrument;

import shop.behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int noOfVolves;

    public Trumpet(int buyingPrice, int sellingPrice, String material, String color, String type, int noOfVolves,String itemName) {
        super(buyingPrice, sellingPrice, material, color, type, itemName);
        this.noOfVolves = noOfVolves;
    }

    public int getNoOfVolves() {
        return noOfVolves;
    }
    // Method
    public String play(){
        return "Trumpet";
    }
}
