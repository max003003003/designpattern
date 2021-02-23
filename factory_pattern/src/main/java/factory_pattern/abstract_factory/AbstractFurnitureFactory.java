package factory_pattern.abstract_factory;

public interface AbstractFurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSof();
}
