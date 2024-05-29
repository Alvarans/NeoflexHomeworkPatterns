package bdproxy;

public class DBProxy {
    String address = "localhost:8080";

    public void connect(String database) {
        Database.connectBD(address, database);
    }
}
