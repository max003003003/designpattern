package decorator_pattern;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .44;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}
