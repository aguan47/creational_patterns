package factory_method;

public class SeaLogistics implements Logistics {
    @Override
    public void planDelivery() {
        System.out.println("Delivery by sea!");
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
