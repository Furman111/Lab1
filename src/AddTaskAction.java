import java.util.Calendar;
import java.util.Date;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class AddTaskAction implements Action {
    private Task task;
    private Journal journal;

    public AddTaskAction(Journal j, Task task) {
        journal = j;
        this.task = task;
    }

    public void execute() {
        if (task.getName() != null)
            if (task.getDate() != null)
                if (task.getDescription() != null) {
                    journal.addTask(Long.valueOf(journal.getAllTasks().size() + 1), new Task(task));
                    task.setDate(null);
                    task.setDescription(null);
                    task.setName(null);
                } else
                    System.out.println("Отсутствует описание новой задачи, введите описание!");
            else
                System.out.println("Не указано время задачи, добавьте время!");
        else
            System.out.println("Не указано имя новой задачи, добавьте имя!");
    }
}
