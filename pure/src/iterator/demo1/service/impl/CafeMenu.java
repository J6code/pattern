package iterator.demo1.service.impl;

import iterator.demo1.service.Iterator;
import iterator.demo1.service.Menu;

import java.util.Hashtable;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("大白菜", "又大又白", false, 100);
        addItem("西红柿", "红又红", true, 0.3);
        addItem("西蓝花", "蓝蓝的", false, 900);
        addItem("草莓", "酸酸的", true, 200);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

//    public Hashtable getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator createIterator() {
//        return menuItems.values().iterator();
        return null;
    }

}
