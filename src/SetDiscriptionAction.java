import java.util.Scanner;

/**
 * Created by FurmanT on 19.11.2016.
 */
public class SetDiscriptionAction implements Action {
    private Task task;

    public SetDiscriptionAction(Task task){
        this.task = task;
    }

    public void execute(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите описание новой задачи:");
        task.setDescription(scan.nextLine());
    }
}
