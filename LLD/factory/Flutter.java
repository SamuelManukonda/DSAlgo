package LLD.factory;

public class Flutter {

    public void setTheme() {
        System.out.println("Setting theme");
    }

    public void setFrameRate() {
        System.out.println("Setting frame rate");
    }

    public UIFactory createUIFactory(String platform) {
        if (platform.equals("IOS")) {
            return new IosUIFactory();
        } else if (platform.equals("ANDROID")) {
            return new AndroidUIFactory();
        }
        return null;
    }
}

