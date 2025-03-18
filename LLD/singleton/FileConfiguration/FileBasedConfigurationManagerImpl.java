package LLD.singleton.FileConfiguration;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManager configurationManager = null;

    private FileBasedConfigurationManagerImpl() {
    }

    @Override
    public String getConfiguration(String key) {
        return (String) this.getProperties().getOrDefault(key, null);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        return convert(key, type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        this.getProperties().put(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        this.getProperties().setProperty(key, value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        this.getProperties().remove(key);
    }

    @Override
    public void clear() {
        this.getProperties().clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if (configurationManager == null) {
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (configurationManager == null) {
                    configurationManager = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return configurationManager;
    }

    public static void resetInstance() {
        configurationManager = null;
    }

}