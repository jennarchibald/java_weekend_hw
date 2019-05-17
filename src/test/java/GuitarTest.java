import MusicShop.InstrumentTypes;
import MusicShop.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar(20.00, 50.00, 6);
    }

    @Test
    public void isStringType(){
        assertEquals(InstrumentTypes.STRING, guitar.getType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(20.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(50.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30.00, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Brrrrrrmmmmm!", guitar.play());
    }
}
