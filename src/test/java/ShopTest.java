import Behaviours.ISell;
import Shop.*;
import Shop.StockItem;
import Shop.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ArrayList<StockItem> stock;
    Guitar guitar;

    @Before
    public void setUp(){
        stock = new ArrayList<StockItem>();
        guitar = new Guitar(115, 250, InstrumentType.STRING,6, "Fender");
        shop = new Shop(stock, "Ray's Music Exchange");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void hasStock() {
        assertEquals(stock, shop.getStock());
    }

    @Test
    public void canGetTill(){
        assertEquals(0.00, shop.getTill(), 0.01);
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        assertEquals(guitar, shop.getStock().get(0));
    }

    @Test
    public void canSellStock(){
        shop.addStock(guitar);
        shop.sellStock(guitar);
        assertEquals(250, shop.getTill(), 0.01);
    }
}
