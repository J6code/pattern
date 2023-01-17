package iterator.demo1.service.impl;

import iterator.demo1.service.Iterator;
import iterator.demo1.service.Menu;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("炒饭", "鸡蛋，米", false, 50);
        addItem("粿条汤", "粿条，水", true, 100);
        addItem("炒面", "面，鸡蛋", false, 200);
        addItem("大锅炖", "肉，水", true, 388.88);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    //    public ArrayList getMenuItems() {
//        return menuItems;
//    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
