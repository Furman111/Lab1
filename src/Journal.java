import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Journal implements Serializable {
    private Map<Long, Task> tasks;

    public Journal(){
        tasks = new HashMap<>();
    }

    public Map<Long, Task> getAllTasks() {
        return tasks;
    }

    public void addTask(Long key, Task task){
        tasks.put(key,task);
    }

    public void deleteTask(Long key){
        tasks.remove(key);
    }

    public void setTask(Long key, Task task){
        tasks.put(key,task);
    }

    public Task getTask(Long key){
        return tasks.get(key);
    }

}
