import Behaviours.ISell;
import Shop.Shop;
import Shop.StockItem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ArrayList<StockItem> stock;

    @Before
    public void setUp(){
        stock = new ArrayList<StockItem>();
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
}
