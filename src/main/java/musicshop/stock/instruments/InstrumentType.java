package musicshop.stock.instruments;

public enum InstrumentType {
    GUITAR("Guitar", 1.40),
    BRASS("Brass", 1.35),
    STRING("String", 1.35),
    PERCUSSION("Percussion", 1.20),
    KEYBOARD("Keyboard", 1.15);
    private final String formattedName;
    private final double markup;

    InstrumentType(String formattedName, double markup) {
        this.formattedName = formattedName;
        this.markup = markup;
    }

    public String getFormattedName() {
        return formattedName;
    }

    public double getMarkup() {
        return markup;
    }
}
