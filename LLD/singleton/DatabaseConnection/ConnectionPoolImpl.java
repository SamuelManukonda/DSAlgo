package LLD.singleton.DatabaseConnection;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance;
    int poolSize;
    private final List<DatabaseConnection> dbConnections;

    private ConnectionPoolImpl(int maxConnections) {
        this.poolSize = maxConnections;
        dbConnections = new ArrayList<>(poolSize);
        initializePool();
    }

    @Override
    public void initializePool() {
        for (int i = 0; i < poolSize; i++) {
            dbConnections.add(new DatabaseConnection(true));
        }

    }

    @Override
    public DatabaseConnection getConnection() {
        DatabaseConnection connection = null;
        for (int i = 0; i < dbConnections.size(); i++) {
            if (dbConnections.get(i).isAvailable()) {
                connection = dbConnections.get(i);
                connection.setAvailable(false);
                return connection;
            }
        }
        return null;

    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        if (connection != null) {
            connection.setAvailable(true);
        }
    }

    @Override
    public int getAvailableConnectionsCount() {
        return (int) dbConnections.stream().filter(DatabaseConnection::isAvailable).count();
    }

    @Override
    public int getTotalConnectionsCount() {
        return this.poolSize;
    }

    public static ConnectionPoolImpl getInstance(int maxConnections) {
        if (instance == null) {
            synchronized (ConnectionPoolImpl.class) {
                if (instance == null) {
                    instance = new ConnectionPoolImpl(maxConnections);
                }
            }
        }

        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

}
