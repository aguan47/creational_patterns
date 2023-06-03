package builder;

public class HouseDirector implements Director {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    @Override
    public House createSimpleHouse() {
        return houseBuilder.initialize()
                .setRoof("Roof")
                .setDoors("Two doors")
                .setRooms("One bathroom, one living room, two bedrooms, one kitchen")
                .setWindows("Windows")
                .build();
    }

    @Override
    public House createHouseWithPorch() {
        return houseBuilder.initialize()
                .setRoof("Roof")
                .setDoors("Two doors")
                .setRooms("One bathroom, one living room, two bedrooms, one kitchen")
                .setWindows("Windows")
                .setPorch("porch")
                .build();
    }

    @Override
    public House createHouseWithSwimmingPool() {
        return houseBuilder.initialize()
                .setRoof("Roof")
                .setDoors("Two doors")
                .setRooms("One bathroom, one living room, two bedrooms, one kitchen")
                .setWindows("Windows")
                .setSwimmingPool("pool")
                .build();
    }

    @Override
    public House createExtravagantHouse() {
        return houseBuilder.initialize()
                .setRoof("Roof")
                .setDoors("Two doors")
                .setRooms("One bathroom, one living room, two bedrooms, one kitchen")
                .setWindows("Windows")
                .setSwimmingPool("pool")
                .setGarage("Garage")
                .setPorch("porch")
                .build();
    }
}
