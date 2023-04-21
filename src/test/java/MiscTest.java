import musicshop.stock.misc.Misc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiscTest {
    private Misc misc;
    @Before
    public void setup(){
        misc = new Misc("Guitar Strings", 8);
    }
    @Test
    public void miscItemHasName() {
        assertEquals("Guitar Strings", misc.getName());
    }
    @Test
    public void miscItemHasBoughtFor() {
        assertEquals(8, misc.getBoughtFor(), 0.01);
    }
    @Test
    public void miscItemHasSellFor() {
        assertEquals(10, misc.getSellFor(), 0.01);
    }
    @Test
    public void miscItemHasMarkupMethod() {
        assertEquals(2, misc.calculateMarkup(), 0.01);
    }
}
