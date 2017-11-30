package app.model;

/**
 * Created by sergioletras on 29/11/17.
 */
public class Quantity {
    private Unit unit;
    private double amount;

    public Quantity(){}

    public Quantity(Unit unit, double amount) {
        this.unit = unit;
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
