/**
 * Created by FurmanT on 10.11.2016.
 */
public class AddTaskAction implements Action{
    Journal journal;
    Task task;

    public AddTaskAction(Journal j, Task t){
        journal=j;
        task = t;
    }

    public void execute(){
        journal.addTask(task);
    }
}