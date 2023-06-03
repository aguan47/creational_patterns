package factory_method;

public class Main {
    public static void main(String[] args) {
        LandLogistics landLogistics = new LandLogistics();
        SeaLogistics seaLogistics = new SeaLogistics();
        Transport landTransport = landLogistics.createTransport();
        Transport seaTransport = seaLogistics.createTransport();

        landTransport.delivery();
        seaTransport.delivery();
    }
}