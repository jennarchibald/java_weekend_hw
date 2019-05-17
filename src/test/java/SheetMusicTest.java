import MusicShop.Enums.MusicPiece;
import MusicShop.Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setup(){
        sheetMusic = new SheetMusic(MusicPiece.ODETOJOY, 1.50, 5.00);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1.50, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(5.00, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.50, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void hasTitle(){
        assertEquals("Ode to Joy", sheetMusic.getTitle());
    }

    @Test
    public void hasComposer(){
        assertEquals("Beethoven", sheetMusic.getComposer());
    }

}
