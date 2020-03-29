package shop;


import shop.behaviours.ISell;

public  abstract class Item implements ISell {

    // Instance Variables
    private int buyingPrice;
    private int sellingPrice;
    private String itemName;

    // Constructor
    public Item(int buyingPrice, int sellingPrice, String itemName) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.itemName = itemName;
    }

    // Getter

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public String getItemName() {
        return itemName;
    }

    // Methods
    public int calculateMarkUp(){
        int markUp = this.sellingPrice - this.buyingPrice;
        return markUp;
    }
}
