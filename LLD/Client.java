package LLD;

import LLD.factory.Flutter;
import LLD.factory.UIFactory;
import LLD.factory.UIFactoryFactory;
import LLD.factory.dropdown.DropDown;

import java.nio.file.Files;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory ios = UIFactoryFactory.getFactory("IOS");

        DropDown dropDown = ios.createDropDown();
        dropDown.displayDropDown();

    }
}
