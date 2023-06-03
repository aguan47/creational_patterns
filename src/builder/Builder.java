package builder;

public interface Builder {
    Builder initialize();
    Builder setDoors(String doors);
    Builder setWindows(String windows);
    Builder setRoof(String roof);
    Builder setRooms(String rooms);
    Builder setGarage(String garage);
    Builder setPorch(String porch);
    Builder setSwimmingPool(String swimmingPool);
    House build();
}
