package design_patterns.factory.components.button;

public class IOSButton implements Button {
    @Override
    public void addButton() {
        System.out.println("Adding button size for ios....");
    }
}
