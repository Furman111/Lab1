/**
 * Created by FurmanT on 17.11.2016.
 */
public class MenuCreator {
    private Journal journal;
    private DataManager dataManager;

    public MenuCreator(Journal journal) {
        this.journal = journal;
    }

    public MenuComponent getMenu(){
            MenuComponent mainMenu = new Menu.Builder("Главное меню").
                    addItem(new MenuItem("Посмотреть список задач", new ShowJournalAction(journal)))
                    .addItem(new MenuItem("Добавить задачу",new AddTaskAction(journal)))
                    .addItem(new MenuItem("Удалить задачу", new DeleteTaskAction(journal)))
                    .addItem(new MenuItem("Редактировать задачу",new EditTaskAction(journal)))
                    .addItem(new MenuItem("Выйти из программы",new ExitAction()))
                    .build();
            return mainMenu;
    }

}
