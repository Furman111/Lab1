package tracking;

import data.*;

import java.util.*;
import userInterface.*;


/**
 * Created by FurmanT on 10.11.2016.
 */
public class Event implements Runnable {
    private Journal journal;
    private List<Task> copyTasks;
    int hashCode;

    public Event(Journal journal) {
        hashCode = 0;
        this.journal = journal;
        copyTasks = new ArrayList<> (journal.getAllTasks());
        this.sort(journal.hashCode());
    }

    private void sort(int currentHashCode) {
        if (currentHashCode!=hashCode) {
            copyTasks = new ArrayList<>(journal.getAllTasks());
            copyTasks.sort(new DateComparator());
            hashCode = currentHashCode;
        }
    }

    private void alert(Task task) {
        ConsoleView.alertAboutTask(task);
    }

    public void run() {
        while (true) {
            sort(journal.hashCode());
            if (!copyTasks.isEmpty()) {
                if (Calendar.getInstance().getTime().after(copyTasks.get(0).getDate().getTime())) {
                    alert(copyTasks.get(0));
                    journal.delete(copyTasks.get(0));
                    copyTasks.remove(0);
                }
            }
        }
    }

}
