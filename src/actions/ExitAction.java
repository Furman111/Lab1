package actions;

import dataExchange.*;
import userInterface.*;
/**
 * Created by FurmanT on 10.11.2016.
 */
public class ExitAction implements Action {


    public void execute(){
        if (DataManager.getPath() == null) {
            System.out.println("Для корректного завершения работы необходимо ввести путь до файла, в котором будут сохранены текущие данные.");
            DataManager.saveJournal(ConsoleView.getPath());
            System.exit(0);
        }
        else
        {
            DataManager.saveJournal(DataManager.getPath());
            System.exit(0);
        }
    }
}
