package design_patterns.factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void addButton() {
        System.out.println("Adding button size for android....");
    }
}
