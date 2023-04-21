package musicshop.stock;

public abstract class Stock implements ISell{
    private double boughtFor;
    private double sellFor;

    public Stock(double boughtFor, double sellFor) {
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;
    }

    public double getBoughtFor() {
        return boughtFor;
    }

    public double getSellFor() {
        return sellFor;
    }

    @Override
    public double calculateMarkup() {
        return this.sellFor - this.boughtFor;
    }
}
