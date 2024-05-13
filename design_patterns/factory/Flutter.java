package design_patterns.factory;

public class Flutter {

    private final Platforms platforms;

    public Flutter(Platforms platforms) {
        this.platforms = platforms;
    }

    public void setTheme() {
        System.out.println("Setting theme....");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate to 120hz.....");
    }

    public UIFactory getFactory() {
//        if (this.platforms == Platforms.ANDROID) {
//            return new AndroidUiFactory();
//        } else if (this.platforms == Platforms.IOS) {
//            return new IOSUiFactory();
//        }
//        return null;

        return UIFactoryFactory.getUIFactoryForPlatform(this.platforms);
    }
}
