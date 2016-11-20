import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Task implements Serializable{
    String name;
    Calendar date;
    String description;

    Task(Task task){
        name = task.getName();
        date = task.getDate();
        description = task.getDescription();
    }

    Task(String name,Calendar data, String dscr){
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

}
