import data.Journal;
import dataExchange.DataManager;
import menu.MenuComponent;
import menu.MenuCreator;
import tracking.Event;
import ui.ConsoleView;

/**
 * Created by FurmanT on 10.11.2016.
 */

public class Lab1 {
    public static void main(String[] args) {
        Journal journal = DataManager.startingLoad();
        Thread event = new Thread(new Event(journal));
        event.start();
        MenuCreator menuCreator = new MenuCreator(journal);
        MenuComponent menu = menuCreator.getMenu();
        ConsoleView.showMenu(menu);
    }
}
