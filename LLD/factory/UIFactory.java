package LLD.factory;

import LLD.factory.button.Button;
import LLD.factory.dropdown.DropDown;
import LLD.factory.menu.Menu;


public interface UIFactory {
    public Button createButton();

    public Menu createMenu();

    public DropDown createDropDown();
}
