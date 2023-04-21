package musicshop.stock.instruments;

public class Trumpet extends Instrument{
    private int valves;
    private String finish;
    public Trumpet(String brand, String model, int valves, String finish, double boughtFor) {
        super(brand, model, InstrumentType.BRASS, boughtFor);
        this.valves = valves;
        this.finish = finish;
    }

    public int getValves() {
        return valves;
    }

    public String getFinish() {
        return finish;
    }
}
