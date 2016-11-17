import java.io.Serializable;
import java.util.Date;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Task implements Serializable{
    String name;
    Date date;
    String description;

    Task(String name,Date data, String dscr){
        this.name = name;
        this.date = data;
        this.description = dscr;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDate(Date data){
        this.date = data;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public String getName(){return name;}
    public Date getDate(){return date;}
    public String getDescription(){return description;}
}
