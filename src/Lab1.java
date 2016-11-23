import java.io.IOException;

/**
 * Created by FurmanT on 10.11.2016.
 */

public class Lab1 {
    public static void main(String[] args) {
        Journal journal = DataManager.startingLoad();
        MenuCreator menuCreator = new MenuCreator(journal);
        MenuComponent menu = menuCreator.getMenu();
        View.showMenu(menu);
    }
}
