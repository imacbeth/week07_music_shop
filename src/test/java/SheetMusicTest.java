import Shop.DrumSticks;
import Shop.SheetMusic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic(5, 8.50, "Pearl");
    }

    @Test
    public void hasGenre() {
        assertEquals("Pearl", sheetMusic.getGenre());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5.00, sheetMusic.getBuyPrice());
    }

    @Test
    public void canCalculateMarkup() {
        Assert.assertEquals(3.50, sheetMusic.calculateMarkUp(), 0.01);
    }
}
