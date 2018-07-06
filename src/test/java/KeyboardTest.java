import Shop.InstrumentType;
import Shop.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp() {
        keyboard = new Keyboard(100.00, 200.00, InstrumentType.PERCUSSION,  88, "Yamaha");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, keyboard.getInstrumentType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(88, keyboard.getNumberOfKeys());
    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", keyboard.getMake());
    }

    @Test
    public void canPlay(){
        assertEquals("plink plonk", keyboard.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100.00, keyboard.calculateMarkUp(), 0.01);
    }
}
