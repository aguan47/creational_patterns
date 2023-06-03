package factory_method;

public class Truck implements Transport {
    @Override
    public void delivery() {
        System.out.println("Delivery by road using a truck!");
    }
}
