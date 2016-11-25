import java.util.*;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Event implements Runnable {
    private Journal journal;
    private Stack<Task> stack;
    int hashCode;

    public Event(Journal journal) {
        this.journal = journal;
        stack = new Stack<>();
        fillStack();
    }

    private void fillStack() {
        journal.getAllTasks().sort(new DateComparator());
        for (int i = journal.size() - 1; i >= 0; i--)
            stack.push(journal.getTask(i));
        hashCode = journal.hashCode();
    }

    private void alert(Task task) {
        View.alertAboutTask(task);
    }

    public void run() {
        while (true) {
            if (journal.hashCode() != hashCode)
                fillStack();
            if (!stack.isEmpty()) {
                if (Calendar.getInstance().getTime().after(stack.peek().getDate().getTime())) {
                    Task task = stack.pop();
                    alert(task);
                    journal.delete(task);
                }
            }
        }
    }

}
