package decorator_pattern;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return getCostSize() * 1.99;
    }
}
