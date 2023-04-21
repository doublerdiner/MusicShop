import musicshop.stock.ISell;
import musicshop.stock.instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    private Violin violin;
    @Before
    public void setup(){
        violin = new Violin("Frank Sandner", "Master de Luxe", 4, true, 3000);
    }
    @Test
    public void violinHasBrand(){
        assertEquals("Frank Sandner", violin.getBrand());
    }
    @Test
    public void violinHasModel(){
        assertEquals("Master de Luxe", violin.getModel());
    }
    @Test
    public void violinHasNumOfStrings(){
        assertEquals(4, violin.getNumOfStrings());
    }
    @Test
    public void violinHasBooleanBowIncluded(){
        assertEquals(true, violin.isBowIncluded());
    }
    @Test
    public void violinHasBoughtFor(){
        assertEquals(3000, violin.getBoughtFor(), 0.01);
    }
    @Test
    public void violinHasSellFor(){
        assertEquals(4050, violin.getSellFor(), 0.01);
    }
    @Test
    public void violinHasMarkupMethod(){
        assertEquals(.35, violin.getMarkupPercentage(), 0.01);
        assertEquals(1050, violin.calculateMarkup(), 0.01);
    }
    @Test
    public void violinHasType(){
        assertEquals("String", violin.getInstrumentType());
    }
    @Test
    public void violinIsInstanceOfISell(){
        assertEquals(true, (violin instanceof ISell));
    }
}
