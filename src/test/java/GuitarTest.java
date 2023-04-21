import musicshop.stock.ISell;
import musicshop.stock.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;
    @Before
    public void setup(){
        guitar = new Guitar("Fender", "American Jazz", 4, true, "Sunburst", 700);
    }
    @Test
    public void guitarHasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }
    @Test
    public void guitarHasModel(){
        assertEquals("American Jazz", guitar.getModel());
    }
    @Test
    public void guitarHasNumOfStrings(){
        assertEquals(4, guitar.getNumOfStrings());
    }
    @Test
    public void guitarHasElectricBoolean(){
        assertEquals(true, guitar.isElectric());
    }
    @Test
    public void guitarHasColour(){
        assertEquals("Sunburst", guitar.getColour());
    }
    @Test
    public void guitarHasBoughtFor(){
        assertEquals(700, guitar.getBoughtFor(), 0.01);
    }
    @Test
    public void guitarHasSellFor(){
        assertEquals(979.99, guitar.getSellFor(), 0.01);
    }
    @Test
    public void guitarIsOfTypeISell(){
        assertEquals(true, (guitar instanceof ISell));
    }
    @Test
    public void guitarHasMarkupMethod(){
        assertEquals(279.99, guitar.calculateMarkup(), 0.01);
    }
    @Test
    public void guitarHasMarkupPercentage(){
        assertEquals(.4, guitar.getMarkupPercentage(), 0.01);
    }
    @Test
    public void guitarHasInstrumentType(){
        assertEquals("Guitar", guitar.getInstrumentType());
    }
}
