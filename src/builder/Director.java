package builder;

public interface Director {
    House createSimpleHouse();
    House createHouseWithPorch();
    House createHouseWithSwimmingPool();
    House createExtravagantHouse();
}
