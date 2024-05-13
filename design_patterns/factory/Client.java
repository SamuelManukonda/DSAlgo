package design_patterns.factory;

import design_patterns.factory.components.button.Button;
import design_patterns.factory.components.dropdown.DropDown;
import design_patterns.factory.components.menu.Menu;


public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter(Platforms.ANDROID);
        UIFactory factory = flutter.getFactory();
        Button button = factory.createButton();
        Menu menu = factory.createMenu();
        DropDown dropDown = factory.createDropDown();
        button.addButton();
        menu.addMenu();;
        dropDown.addDropDowm();

    }
}
