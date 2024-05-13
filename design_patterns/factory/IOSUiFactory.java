package design_patterns.factory;

import design_patterns.factory.components.button.IOSButton;
import design_patterns.factory.components.dropdown.IOSDropDown;
import design_patterns.factory.components.menu.IOSMenu;


public class IOSUiFactory implements  UIFactory {


    @Override
    public IOSButton createButton() {
        System.out.println("Creating an ios button....");
        return new IOSButton();
    }

    @Override
    public IOSDropDown createDropDown() {
        System.out.println("Creating an ios drop down ....");
        return new IOSDropDown();
    }

    @Override
    public IOSMenu createMenu() {
        System.out.println("Creating an ios menu....");
        return new IOSMenu();

    }
}
