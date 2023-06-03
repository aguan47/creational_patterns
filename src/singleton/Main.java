package singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseClient client1 = DatabaseClient.getInstance();
        DatabaseClient client2 = DatabaseClient.getInstance();

        System.out.println(client1.equals(client2));
    }
}
