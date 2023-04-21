package musicshop.stock.instruments;

public class Guitar extends Instrument {
    private int numOfStrings;
    private boolean electric;
    private String colour;
    public Guitar(String brand, String model, int numOfStrings, boolean electric, String colour, double boughtFor) {
        super(brand, model, InstrumentType.GUITAR, boughtFor);
        this.numOfStrings = numOfStrings;
        this.electric = electric;
        this.colour = colour;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public boolean isElectric() {
        return electric;
    }

    public String getColour() {
        return colour;
    }
}
