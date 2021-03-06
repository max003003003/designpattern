package factory_pattern.abstract_method_factory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //this is abstract method factory
    abstract Pizza createPizza(String type);
}
