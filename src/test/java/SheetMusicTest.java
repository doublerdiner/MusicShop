import musicshop.stock.ISell;
import musicshop.stock.sheetmusic.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    private SheetMusic sheetmusic;
    @Before
    public void setup(){
        sheetmusic = new SheetMusic("Errors", "Lease of Life", "Keyboard", 12.00);
    }
    @Test
    public void sheetMusicHasArtist(){
        assertEquals("Errors", sheetmusic.getArtist());
    }
    @Test
    public void sheetMusicHasAlbum() {
        assertEquals("Lease of Life", sheetmusic.getAlbum());
    }
    @Test
    public void sheetMusicHasInstrument(){
        assertEquals("Keyboard", sheetmusic.getForInstrument());
    }
    @Test
    public void sheetMusicHasBoughtFor(){
        assertEquals(12, sheetmusic.getBoughtFor(), 0.01);
    }
    @Test
    public void sheetMusicHasSellFor(){
        assertEquals(15.6, sheetmusic.getSellFor(), 0.01);
    }
    @Test
    public void sheetMusicHasISellType(){
        assertEquals(true, (sheetmusic instanceof ISell));
    }
    @Test
    public void sheetMusicHasMarkupMethod(){
        assertEquals(3.6, sheetmusic.calculateMarkup(), 0.01);
    }

}
