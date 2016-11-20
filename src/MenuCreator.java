import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by FurmanT on 17.11.2016.
 */
public class MenuCreator {

    public static MenuComponent menu() throws Exception{
        try {
            Task tempTask = new Task(null,null,null);
            MenuComponent addTaskMenu =new Menu.Builder("Добавить задачу")
                    .addItem(new MenuItem("Ввести название планируемой задачи", new SetNameAction(tempTask)))
                    .addItem(new MenuItem("Ввести описание планируемой задачи", new SetDiscriptionAction(tempTask)))
                    .addItem(new MenuItem("Ввести время планируемой задачи", new SetTimeAction(tempTask)))
                    .addItem(new MenuItem("Создать задачу с заданными параметрами", new AddTaskAction(JournalLoader.getInstance().getJournal(), tempTask)))
                    .build();
            MenuComponent mainMenu = new Menu.Builder("Главное меню").
                    addItem(new MenuItem("Посмотреть список задач", new ShowJournalAction(JournalLoader.getInstance().getJournal())))
                    .addItem(addTaskMenu)
                    .addItem(new MenuItem("Удалить задачу", new DeleteTaskAction(JournalLoader.getInstance().getJournal(),0)))
                    .addItem(new MenuItem("Выйти из программы",new ExitAction(JournalLoader.getInstance().getJournal())))
                    .build();
            addTaskMenu.add(new MenuItem("Вернуться в предыдущее меню", new BackAction(mainMenu)),addTaskMenu.getSize());

            return mainMenu;

            /*return new Menu.Builder("Главное меню").
                    addItem(new MenuItem("Посмотреть список задач", new ShowJournalAction(JournalLoader.getInstance().getJournal())))
                    .addItem(new Menu.Builder("Добавить задачу")
                            .addItem(new MenuItem("Ввести название планируемой задачи", new SetNameAction(tempName)))
                            .addItem(new MenuItem("Ввести описание планируемой задачи", new SetDiscriptionAction(tempDiscription)))
                            .addItem(new MenuItem("Ввести время планируемой задачи", new SetTimeAction(tempDate)))
                            .addItem(new MenuItem("Создать задачу с заданными параметрами", new AddTaskAction(JournalLoader.getInstance().getJournal(), tempName,tempDiscription,tempDate)))
                            .build())
                    .addItem(new MenuItem("Удалить задачу", new DeleteTaskAction(JournalLoader.getInstance().getJournal(),0)))
                    .addItem(new MenuItem("Выйти из программы",new ExitAction(JournalLoader.getInstance().getJournal())))
                    .build();*/
        }
        catch(Exception e){throw e;}
    }


}
