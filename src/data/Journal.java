package data;

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
        return new ArrayList<> (tasks);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Journal)) return false;

        Journal tasks1 = (Journal) o;

        return tasks.equals(tasks1.tasks);

    }

    @Override
    public int hashCode() {
        return tasks != null ? tasks.hashCode() : 0;
    }


}
