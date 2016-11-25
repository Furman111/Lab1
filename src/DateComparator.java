import java.util.Comparator;

/**
 * Created by FurmanT on 24.11.2016.
 */
public class DateComparator implements Comparator<Task> {
    public int compare(Task task1, Task task2){
        if (task1.getDate().getTime().getTime()<task2.getDate().getTime().getTime()) return -1;
        else
        if (task1.getDate().getTime().getTime()>task2.getDate().getTime().getTime()) return 1;
        else
            return 0;
    }
}
