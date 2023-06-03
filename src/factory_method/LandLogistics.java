package factory_method;

public class LandLogistics implements Logistics {
    @Override
    public void planDelivery() {
        System.out.println("Delivery by land!");
    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
