import MusicShop.Instruments.Guitar;
import MusicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void setup(){
        shop = new Shop();
        guitar = new Guitar(20.00, 50.00, 6);
    }

    @Test
    public void startsWithEmptyStock(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addItem(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.stockCount());
    }
}
