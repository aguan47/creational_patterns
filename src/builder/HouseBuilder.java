package builder;

public class HouseBuilder implements Builder {
    private House house;
    @Override
    public Builder initialize() {
        house = new House();
        return this;
    }

    @Override
    public Builder setDoors(String doors) {
        house.setDoor(doors);
        return this;
    }

    @Override
    public Builder setWindows(String windows) {
        house.setWindows(windows);
        return this;
    }

    @Override
    public Builder setRoof(String roof) {
        house.setRoof(roof);
        return this;
    }

    @Override
    public Builder setRooms(String rooms) {
        house.setRooms(rooms);
        return this;
    }

    @Override
    public Builder setGarage(String garage) {
        house.setGarage(garage);
        return this;
    }

    @Override
    public Builder setPorch(String porch) {
        house.setPorch(porch);
        return this;
    }

    @Override
    public Builder setSwimmingPool(String swimmingPool) {
        house.setSwimmingPool(swimmingPool);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
