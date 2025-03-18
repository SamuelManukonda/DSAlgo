package design_patterns.factory;

import design_patterns.factory.components.button.Button;
import design_patterns.factory.components.dropdown.DropDown;
import design_patterns.factory.components.menu.Menu;


public interface UIFactory {

    public Button createButton();

    public DropDown createDropDown();

    public Menu createMenu();

}
