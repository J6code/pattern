package iterator.demo1.service.impl;

import iterator.demo1.service.Iterator;
import iterator.demo1.service.Menu;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("大白菜", "又大又白", false, 100);
        addItem("西红柿", "红又红", true, 0.3);
        addItem("西蓝花", "蓝蓝的", false, 900);
        addItem("草莓", "酸酸的", true, 200);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("TOO MAX");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    //
//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
