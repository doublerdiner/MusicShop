package musicshop.stock.instruments;

public class Violin extends Instrument{
    private int numOfStrings;
    private boolean bowIncluded;
    public Violin(String brand, String model, int numOfStrings, boolean bowIncluded, double boughtFor) {
        super(brand, model, InstrumentType.STRING, boughtFor);
        this.numOfStrings = numOfStrings;
        this.bowIncluded = bowIncluded;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public boolean isBowIncluded() {
        return bowIncluded;
    }
}
