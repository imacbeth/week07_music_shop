import Shop.SheetMusic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic(5, 9.99, "Classical");
    }

    @Test
    public void hasGenre() {
        assertEquals("Classical", sheetMusic.getGenre());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5.00, sheetMusic.getBuyPrice());
    }

    @Test
    public void canCalculateMarkup() {
        Assert.assertEquals(4.99, sheetMusic.calculateMarkUp(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        sheetMusic.setSellPrice(10.50);
        assertEquals(10.50, sheetMusic.getSellPrice(), 0.01);
    }
}
