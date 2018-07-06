import Shop.Guitar;
import Shop.InstrumentType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(125.00, 215.00, InstrumentType.STRING, 6, "Fender" );
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canPlay(){
        assertEquals("playing guitar solo", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        Assert.assertEquals(90.00, guitar.calculateMarkUp(), 0.01);
    }
}
