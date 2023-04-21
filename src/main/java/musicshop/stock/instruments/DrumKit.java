package musicshop.stock.instruments;

public class DrumKit extends Instrument{
    private String wood;
    private String colour;
    private int pieces;
    public DrumKit(String brand, String model, int pieces, String wood, String colour, double boughtFor) {
        super(brand, model, InstrumentType.PERCUSSION, boughtFor);
        this.pieces = pieces;
        this.wood = wood;
        this.colour = colour;
    }

    public int getPieces() {
        return pieces;
    }

    public String getWood() {
        return wood;
    }

    public String getColour() {
        return colour;
    }
}
