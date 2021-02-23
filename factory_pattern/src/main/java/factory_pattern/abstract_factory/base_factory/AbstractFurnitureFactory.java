package factory_pattern.abstract_factory.base_factory;

import factory_pattern.abstract_factory.base_furniture.Chair;
import factory_pattern.abstract_factory.base_furniture.CoffeeTable;
import factory_pattern.abstract_factory.base_furniture.Sofa;

public interface AbstractFurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
