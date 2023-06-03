package factory_method;

public interface Logistics {
    void planDelivery();
    Transport createTransport();
}
