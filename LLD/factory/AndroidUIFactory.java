package LLD.factory;

import LLD.factory.button.AndroidButton;
import LLD.factory.button.Button;
import LLD.factory.dropdown.AndroidDropDown;
import LLD.factory.dropdown.DropDown;
import LLD.factory.menu.AndroidMenu;
import LLD.factory.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
