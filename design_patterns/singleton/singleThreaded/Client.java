package design_patterns.singleton.singleThreaded;

public class Client {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    }
}
