package LLD.factory.button;

public class IosButton implements  Button{
    @Override
    public void changeButtonSize() {
        System.out.println("Change button size for Ios");
    }
}
