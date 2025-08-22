package patika_4_oop._2_banking_system;

public enum CurrencyType {

    TL("TL"),
    DOLAR("$"),
    EURO("Є"),
    GOLD("G");


    private final String symbol;

    CurrencyType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
