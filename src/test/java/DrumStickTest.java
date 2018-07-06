import Shop.DrumSticks;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumStickTest {

    DrumSticks drumSticks;

    @Before
    public void setUp() {
        drumSticks = new DrumSticks(5, 8.50, "Pearl");
    }

    @Test
    public void hasMake() {
        assertEquals("Pearl", drumSticks.getMake());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5.00, drumSticks.getBuyPrice());
    }

    @Test
    public void canCalculateMarkup() {
        Assert.assertEquals(3.50, drumSticks.calculateMarkUp(), 0.01);
    }
}
