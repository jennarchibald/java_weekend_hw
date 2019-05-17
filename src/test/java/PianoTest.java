import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setup(){
        piano = new Piano(200.00, 500.00, 7);
    }

    @Test
    public void hasOctaveRange(){
        assertEquals(7, piano.getOctaveRange());
    }

    @Test
    public void canPlay(){
        assertEquals("Plink plonk", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(300.00, piano.calculateMarkup(), 0.01);
    }
}
