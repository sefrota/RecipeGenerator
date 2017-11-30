package app.model;

/**
 * Created by sergioletras on 29/11/17.
 */
public class Ingredient {

    private double id;
    private String name;
    private Quantity quantity;

    public Ingredient(){}

    public Ingredient(double id, String name, Quantity quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }
}
