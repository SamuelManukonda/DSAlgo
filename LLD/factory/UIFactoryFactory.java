package LLD.factory;

public class UIFactoryFactory {

    public static UIFactory getFactory(String platform) {

        switch (platform) {
            case "IOS":
                return new IosUIFactory();
            case "ANDROID":
                return new AndroidUIFactory();
        }
        return null;
    }
}
