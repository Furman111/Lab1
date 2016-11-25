import java.io.Serializable;
import java.util.*;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Journal implements Serializable,Iterable<Task> {
    private List<Task> tasks;

    public Journal(){
        tasks = new ArrayList<>();
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(int index,Task task){
        tasks.add(index,task);
    }

    public void deleteTask(int index){
        tasks.remove(index);
    }

    public void setTask(int index, Task task){
        tasks.set(index,task);
    }

    public Task getTask(int index){
        return tasks.get(index);
    }

    public int size(){
        return tasks.size();
    }

    public Iterator iterator(){
        return tasks.iterator();
    }

    public void delete(Task task){
            tasks.remove(task);
    }

    public int hashCode(){
        int res = Integer.MAX_VALUE;
        for(Task task: tasks)
            res ^=task.hashCode();
        return res;
    }

}
