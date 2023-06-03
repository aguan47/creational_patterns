package factory_method;

public class Ship implements Transport {
    @Override
    public void delivery() {
        System.out.println("Delivery by water using a ship!");
    }
}
