package design_patterns.singleton.multithreaded;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(databaseConnection == null ){ // t1, t2 threads without a lock
            synchronized (DatabaseConnection.class){ //Taking a lock only for the first time so
                if(databaseConnection == null){ // Second check after the lock is released.
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }
}
