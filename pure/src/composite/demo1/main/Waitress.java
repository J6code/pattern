package composite.demo1.main;

import composite.demo1.service.impl.MenuComponent;

import java.util.Iterator;

/**
 * 服务员对象，组合树的使用者
 */
public class Waitress {
    // 组合树对象
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    // 内部迭代器
    public void printMenu() {
        allMenus.print();
    }

    // 外部迭代器
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\n VEGETARIAN MENU \n =====");
        while (iterator.hasNext()) {
            MenuComponent next = (MenuComponent) iterator.next();
            try {
                if (next.isVegetarian()) {
                    next.print();
                }
            } catch (UnsupportedOperationException e) {

            }

        }
    }
}
