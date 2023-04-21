import musicshop.stock.ISell;
import musicshop.stock.instruments.DrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {
    private DrumKit drumkit;
    @Before
    public void setup(){
        drumkit = new DrumKit("Tama", "Starclassic", 5, "Birch", "Phantasm Oyster", 2000);
    }
    @Test
    public void drumkitHasBrand(){
        assertEquals("Tama", drumkit.getBrand());
    }
    @Test
    public void drumkitHasModel(){
        assertEquals("Starclassic", drumkit.getModel());
    }
    @Test
    public void drumkitHasNumberOfPieces(){
        assertEquals(5, drumkit.getPieces());
    }
    @Test
    public void drumkitHasWood(){
        assertEquals("Birch", drumkit.getWood());
    }
    @Test
    public void drumkitHasColour(){
        assertEquals("Phantasm Oyster", drumkit.getColour());
    }
    @Test
    public void drumkitHasBoughtFor(){
        assertEquals(2000, drumkit.getBoughtFor(), 0.01);
    }
    @Test
    public void drumkitHasSellFor(){
        assertEquals(2400, drumkit.getSellFor(), 0.01);
    }
    @Test
    public void drumkitHasInstrumentType(){
        assertEquals("Percussion", drumkit.getInstrumentType());
    }
    @Test
    public void drumkitHasMarkupMethod(){
        assertEquals(.2, drumkit.getMarkupPercentage(), 0.01);
        assertEquals(400, drumkit.calculateMarkup(), 0.01);
    }
    @Test
    public void drumkitIsInstanceOfISell(){
        assertEquals(true, (drumkit instanceof ISell));
    }
    @Test
    public void drumkitHasPlayMethod(){
        assertEquals("Ba Doom Tish", drumkit.play());
    }
}
