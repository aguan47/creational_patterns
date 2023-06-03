package singleton;

public class DatabaseClient {
    private static DatabaseClient client;

    public static DatabaseClient getInstance() {
        if (null != client) {
            return client;
        }
        client = new DatabaseClient();
        return client;
    }

    private DatabaseClient(){}
}
