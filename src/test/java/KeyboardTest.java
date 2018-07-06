import Shop.InstrumentType;
import Shop.Keyboard;
import org.junit.Before;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp() {
        keyboard = new Keyboard(100.00, 200.00, InstrumentType.PERCUSSION,  88, "Yamaha");
    }
}
