package data;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Task implements Serializable{
    private String name;
    private Calendar date;
    private String description;

    public Task(Task task){
        name = task.getName();
        date = task.getDate();
        description = task.getDescription();
    }

    public Task(String name,Calendar data, String dscr){
        this.name = name;
        this.date = data;
        this.description = dscr;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDate(Calendar data){
        this.date = data;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public String getName(){return name;}
    public Calendar getDate(){return date;}
    public String getDescription(){return description;}



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (name != null ? !name.equals(task.name) : task.name != null) return false;
        if (date != null ? !date.equals(task.date) : task.date != null) return false;
        return description != null ? description.equals(task.description) : task.description == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    /*
    public int hashCode(){
        return name.hashCode()^date.hashCode()^description.hashCode();
    }
*/
}
