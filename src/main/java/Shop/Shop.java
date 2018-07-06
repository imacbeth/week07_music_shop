package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {


    ArrayList<ISell> stock;
    private String name;

    public Shop(ArrayList<ISell> stock, String name) {
        this.stock = stock;
        this.name = name;
    }


}
