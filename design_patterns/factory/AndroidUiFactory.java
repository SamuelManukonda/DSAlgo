package design_patterns.factory;


import design_patterns.factory.components.button.AndroidButton;
import design_patterns.factory.components.dropdown.AndroidDropDown;
import design_patterns.factory.components.menu.AndroidMenu;

public class AndroidUiFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        System.out.println("Creating an android button....");
        return new AndroidButton();
    }

    @Override
    public AndroidDropDown createDropDown() {
        System.out.println("Creating an android drop down....");
        return new AndroidDropDown();
    }

    @Override
    public AndroidMenu createMenu() {
        System.out.println("Creating an android menu....");
        return new AndroidMenu();
    }
}
