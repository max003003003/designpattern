package factory_pattern.abstract_method_factory;

import factory_pattern.abstract_method_factory.Ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
//        else if (item.equals("veggie")){
//            return new NYStyeleVeggiePizza();
//        } else if (item.equals("clam")){
//            return new NYStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
//        }
        else return null;
    }
}
