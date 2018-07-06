import org.junit.Before;
import org.junit.Test;

import javax.print.DocFlavor;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRING, 6, "Fender" );
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

}
