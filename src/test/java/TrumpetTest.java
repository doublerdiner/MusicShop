import musicshop.stock.ISell;
import musicshop.stock.instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    private Trumpet trumpet;
    @Before
    public void setup(){
        trumpet = new Trumpet("Conn", "CONNstellation", 3, "Lacquer", 1250);
    }
    @Test
    public void trumpetHasBrand(){
        assertEquals("Conn", trumpet.getBrand());
    }
    @Test
    public void trumpetHasModel(){
        assertEquals("CONNstellation", trumpet.getModel());
    }
    @Test
    public void trumpetHasValves(){
        assertEquals(3, trumpet.getValves());
    }
    @Test
    public void trumpetHasFinish(){
        assertEquals("Lacquer", trumpet.getFinish());
    }
    @Test
    public void trumpetHasBoughtFor(){
        assertEquals(1250, trumpet.getBoughtFor(), 0.01);
    }
    @Test
    public void trumpetHasSellFor(){
        assertEquals(1687.5, trumpet.getSellFor(), 0.01);
    }
    @Test
    public void trumpetIsInstanceOfISell(){
        assertEquals(true, (trumpet instanceof ISell));
    }
    @Test
    public void trumpetHasMarkupMethod(){
        assertEquals(437.5, trumpet.calculateMarkup(), 0.01);
    }
    @Test
    public void trumpetHasMarkupPercentage(){
        assertEquals(.35, trumpet.getMarkupPercentage(),0.01);
    }
    @Test
    public void trumpetHasInstrumentType(){
        assertEquals("Brass", trumpet.getInstrumentType());
    }
}
