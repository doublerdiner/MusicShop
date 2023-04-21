import musicshop.stock.ISell;
import musicshop.stock.instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    private Keyboard keyboard;
    @Before
    public void setup(){
        keyboard = new Keyboard("Nord", "Electro 6D", 73, 1300);
    }
    @Test
    public void keyboardHasBrand(){
        assertEquals("Nord", keyboard.getBrand());
    }
    @Test
    public void keyboardHasModel(){
        assertEquals("Electro 6D", keyboard.getModel());
    }
    @Test
    public void keyboardHasNumOfKeys(){
        assertEquals(73, keyboard.getNumOfKeys());
    }
    @Test
    public void keyboardHasBoughtFor(){
        assertEquals(1300, keyboard.getBoughtFor(), 0.01);
    }
    @Test
    public void keyboardHasSellFor(){
        assertEquals(1495, keyboard.getSellFor(), 0.01);
    }
    @Test
    public void keyboardIsInstanceOfISell(){
        assertEquals(true, (keyboard instanceof ISell));
    }
    @Test
    public void keyboardHasMarkupMethod(){
        assertEquals(195, keyboard.calculateMarkup(), 0.01);
    }
    @Test
    public void keyboardHasMarkupPercentage(){
        assertEquals(.15, keyboard.getMarkupPercentage(), 0.01);
    }

}
