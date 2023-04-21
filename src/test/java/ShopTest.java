import musicshop.Shop;
import musicshop.stock.instruments.Guitar;
import musicshop.stock.instruments.Keyboard;
import musicshop.stock.instruments.Trumpet;
import musicshop.stock.misc.Misc;
import musicshop.stock.sheetmusic.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Keyboard keyboard;
    private Trumpet trumpet;
    private SheetMusic sheetmusic;
    private Misc guitarStrings;
    private Guitar guitar;
    @Before
    public void setup(){
        shop = new Shop("Guitars and More");
        keyboard = new Keyboard("Nord", "Electro 6D", 73, 1300);
        trumpet = new Trumpet("Conn", "CONNstellation", 3, "Lacquer", 1250);
        sheetmusic = new SheetMusic("Errors", "Lease of Life", "Keyboard", 12.00);
        guitarStrings = new Misc("Guitar Strings", 8);
        guitar = new Guitar("Fender", "American Jazz", 4, true, "Sunburst", 700);
    }
    @Test
    public void shopHasName(){
        assertEquals("Guitars and More", shop.getName());
    }
    @Test
    public void shopStartsWithEmptyStockList(){
        assertEquals(0, shop.getAllStock().size());
    }
    @Test
    public void stockCanBeAddedToShop(){
        shop.add(trumpet);
        shop.add(keyboard);
        shop.add(guitar);
        shop.add(guitar);
        shop.add(guitar);
        assertEquals(5, shop.getAllStock().size());
        assertEquals(guitar, shop.getAllStock().get(3));
    }
    @Test
    public void stockCanBeRemovedFromShop(){
        shop.add(trumpet);
        shop.add(keyboard);
        shop.add(guitar);
        assertEquals(3, shop.getAllStock().size());
        shop.remove(trumpet);
        assertEquals(2, shop.getAllStock().size());
        assertEquals(keyboard, shop.getAllStock().get(0));
        assertEquals(guitar, shop.getAllStock().get(1));
    }
    @Test
    public void shopCanCalculateTotalMarkupForStock(){
        shop.add(trumpet);
        shop.add(keyboard);
        shop.add(guitar);
        shop.add(guitar);
        shop.add(guitar);
        double answer = shop.calculateTotalStockMarkup();
        assertEquals(1472.5, answer, 0.01);
    }
}
