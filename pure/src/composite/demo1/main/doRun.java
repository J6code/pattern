package composite.demo1.main;

import composite.demo1.service.impl.Menu;
import composite.demo1.service.impl.MenuComponent;
import composite.demo1.service.impl.MenuItem;

public class doRun {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu =
                new Menu("Cafe Menu", "Diner");
        MenuComponent dessertMenu =
                new Menu("Dessert Menu", "Dessert Of Course");
        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dessertMenu.add(
                new MenuItem("Pasta",
                        "Spaghetti With Marinara Sauce, And A Slice Of Sourdough Bread",
                        true,
                        3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(
                new MenuItem(
                        "Apple Pie",
                        "Apple Pie Desc",
                        true,
                        1.56));
        // 菜单构建完成


        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
