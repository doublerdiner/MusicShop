package musicshop.stock.instruments;

public class Keyboard extends Instrument{
    private int numOfKeys;
    public Keyboard(String brand, String model, int numOfKeys, double boughtFor) {
        super(brand, model, InstrumentType.KEYBOARD, boughtFor);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }
}
