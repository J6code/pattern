package iterator.demo1.main;

import iterator.demo1.service.impl.DinerMenu;
import iterator.demo1.service.impl.PancakeHouseMenu;

public class doRun {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
