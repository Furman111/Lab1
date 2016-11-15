import java.util.Map;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Journal {
    private Task[] tasks;

    public Map<Long, Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task){
        Task[] t = new Task[tasks.length+1];
        for(int i=0;i<tasks.length;i++)
            t[i] = tasks[i];
        t[tasks.length+1]=task;
        tasks = t;
    }

    public void deleteTask(int num){
    }

    public void setTask(Task task, int num){}

    public Task getTask(int num){
        return tasks[num];
    }

}
