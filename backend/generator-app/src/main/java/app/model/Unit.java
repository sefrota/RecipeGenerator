package app.model;

/**
 * Created by sergioletras on 29/11/17.
 */
public class Unit {

    private String symbol;
    private String description;

    public Unit(){}

    public Unit(String symbol, String description) {
        this.symbol = symbol;
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
