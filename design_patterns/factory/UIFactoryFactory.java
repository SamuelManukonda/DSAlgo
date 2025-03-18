package design_patterns.factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(Platforms platforms) {
        UIFactory uiFactory = null;
         switch (platforms) {
            case IOS:
                uiFactory= new IOSUiFactory();
                break;
            case ANDROID:
                uiFactory =new AndroidUiFactory();
                break;
        }
        return uiFactory;

    }
}
