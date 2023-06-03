package builder;

public class House {
    private String door;
    private String windows;
    private String roof;
    private String rooms;
    private String porch;
    private String swimmingPool;
    private String garage;

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getPorch() {
        return porch;
    }

    public void setPorch(String porch) {
        this.porch = porch;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "door='" + door + '\'' +
                ", windows='" + windows + '\'' +
                ", roof='" + roof + '\'' +
                ", rooms='" + rooms + '\'' +
                ", porch='" + porch + '\'' +
                ", swimmingPool='" + swimmingPool + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
}
