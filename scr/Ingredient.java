package scr;

public class Ingredient {

    private String name;
    private String unit;
    private float quantity;
    private boolean vegan;

    public Ingredient (float quantity, String unit, String name, boolean vegan){
        this.quantity=quantity;
        this.unit=unit;
        this.name=name;
        this.vegan=vegan;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public float getQuantity() {
        return quantity;
    }

    public boolean isVegan() {
        return vegan;
    }

    public String toString (){
        if (vegan){
            return unit + " " + name + " (VEGAN)";}
        else {
            return unit + " " + name;
        }
    }
}
