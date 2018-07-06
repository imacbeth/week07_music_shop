package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {


    ArrayList<StockItem> stock;
    private String name;
    private double till;


    public Shop(ArrayList<StockItem> stock, String name) {
        this.stock = stock;
        this.name = name;
        this.till = 0.00;
    }

    public ArrayList<StockItem> getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void addStock(StockItem stockItem) {
         stock.add(stockItem);
    }

    public void sellStock(StockItem stockItem) {
        stock.remove(stockItem);
        till += stockItem.getSellPrice();
    }


}
