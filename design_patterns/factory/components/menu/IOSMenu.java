package design_patterns.factory.components.menu;

public class IOSMenu implements Menu {

    @Override
    public void addMenu() {
        System.out.println("Adding menu size for ios....");
    }
}
