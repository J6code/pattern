package iterator.demo1.main;

import iterator.demo1.service.Iterator;
import iterator.demo1.service.Menu;
import iterator.demo1.service.impl.DinerMenu;
import iterator.demo1.service.impl.MenuItem;
import iterator.demo1.service.impl.PancakeHouseMenu;

public class Waitress {
    // PancakeHouseMenu pancakeHouseMenu;
    // DinerMenu dinerMenu;
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    //    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    //        this.pancakeHouseMenu = pancakeHouseMenu;
    //        this.dinerMenu = dinerMenu;
    //    }
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("pancakeHouseMenuIterator  ---- ");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("dinerMenuIterator  ---- ");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println("菜名：" + menuItem.getName());
            System.out.println("价钱：" + menuItem.getPrice());
            System.out.println("描述：" + menuItem.getDescription());
        }
    }
}
