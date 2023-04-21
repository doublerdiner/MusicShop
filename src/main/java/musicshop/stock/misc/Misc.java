package musicshop.stock.misc;

import musicshop.stock.Stock;

public class Misc extends Stock {
    private String name;
    public Misc(String name, double boughtFor) {
        super(boughtFor, (boughtFor * 1.25));
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
