package shop;

import shop.behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    // Instance Variables
    private ArrayList<ISell> stock;

    // Constructor
    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    // Methods
    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromstock(ISell item){
        stock.remove(item);
    }

    public int getStockCount(){
        return this.stock.size();
    }

}
