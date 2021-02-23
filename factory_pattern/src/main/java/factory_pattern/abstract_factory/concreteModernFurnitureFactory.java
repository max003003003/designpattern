package factory_pattern.abstract_factory;

import factory_pattern.abstract_factory.base_factory.AbstractFurnitureFactory;
import factory_pattern.abstract_factory.base_furniture.Chair;
import factory_pattern.abstract_factory.base_furniture.CoffeeTable;
import factory_pattern.abstract_factory.base_furniture.Sofa;
import factory_pattern.abstract_factory.modern.ModernChair;
import factory_pattern.abstract_factory.modern.ModernCoffeeTable;
import factory_pattern.abstract_factory.modern.ModernSofa;

public class concreteModernFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new concreteModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new concreteModerCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new concreteModerSofa();
    }
}

class concreteModernChair implements ModernChair {
    private String name;

    public concreteModernChair() {
        this.name = "modern chair";
    }

    public String getName() {
        return name;
    }
}

class concreteModerCoffeeTable implements ModernCoffeeTable {
    private String name;

    public concreteModerCoffeeTable() {
        this.name = "modern coffee table";
    }

    public String getName() {
        return name;
    }
}

class concreteModerSofa implements ModernSofa {


    private String name;

    public concreteModerSofa() {
        this.name = "modern sofa";
    }

    public String getName() {
        return name;
    }
}
