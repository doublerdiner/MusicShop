package musicshop.stock.instruments;

import musicshop.stock.Stock;

public abstract class Instrument extends Stock implements IPlay{
    private String brand;
    private String model;
    private InstrumentType instrumentType;
    public Instrument(String brand, String model, InstrumentType instrumentType, double boughtFor) {
        super(boughtFor, (boughtFor * instrumentType.getMarkup()));
        this.brand = brand;
        this.model = model;
        this.instrumentType = instrumentType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getInstrumentType() {
        return instrumentType.getFormattedName();
    }
    public double getMarkupPercentage(){
        return instrumentType.getMarkup()-1;
    }
}
