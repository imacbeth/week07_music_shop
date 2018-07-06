import Shop.DrumSticks;
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
}
