package builder;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        HouseDirector director = new HouseDirector(new HouseBuilder());
        House simpleHouse = director.createSimpleHouse();
        House houseWithPool = director.createHouseWithSwimmingPool();
        House houseWithPorch = director.createHouseWithPorch();
        House extravagantHouse = director.createExtravagantHouse();

        listOutHouseSpecs(simpleHouse);
        listOutHouseSpecs(houseWithPool);
        listOutHouseSpecs(houseWithPorch);
        listOutHouseSpecs(extravagantHouse);

    }

    private static void listOutHouseSpecs(House house) {
        System.out.println(house.toString());
    }
}
