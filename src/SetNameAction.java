import java.util.Scanner;

/**
 * Created by FurmanT on 19.11.2016.
 */
public class SetNameAction implements Action {
    private Task task;

    public SetNameAction(Task task) {
        this.task = task;
    }

    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название новой задачи:");
        task.setName(scan.nextLine());
    }

}
