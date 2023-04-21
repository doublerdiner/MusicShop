package musicshop.stock.sheetmusic;

import musicshop.stock.Stock;

public class SheetMusic extends Stock {
    private String artist;
    private String album;
    private String forInstrument;
    public SheetMusic(String artist, String album, String forInstrument, double boughtFor) {
        super(boughtFor, (boughtFor * 1.3));
        this.artist = artist;
        this.album = album;
        this.forInstrument = forInstrument;
    }

    public String getArtist() {
    return artist;
    }

    public String getAlbum() {
        return album;
    }
    public String getForInstrument() {
        return forInstrument;
    }
}
