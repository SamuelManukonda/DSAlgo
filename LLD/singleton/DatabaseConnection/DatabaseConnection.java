package LLD.singleton.DatabaseConnection;

public class DatabaseConnection {

    private boolean isAvailable;

    public DatabaseConnection(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
