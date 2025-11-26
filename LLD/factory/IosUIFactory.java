package LLD.factory;

import LLD.factory.button.Button;
import LLD.factory.button.IosButton;
import LLD.factory.dropdown.DropDown;
import LLD.factory.dropdown.IosDrpDown;
import LLD.factory.menu.IosMenu;
import LLD.factory.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDrpDown();
    }
}
