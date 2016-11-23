import java.util.Scanner;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class DeleteTaskAction implements Action {
    private Journal journal;

    public DeleteTaskAction(Journal j){
        journal = j;
    }

    public void execute() {
            for (int i = 0; i < journal.size(); i++)
                System.out.println(i + 1 + ") " + journal.getTask(i).getName());
            System.out.println();
            System.out.println("Для удаления задачи введите её номер. Для возврата в главное меню нажмите Enter");
            int ind = -1;
            while (true) {
                Scanner in = new Scanner(System.in);
                try {
                    String res = in.nextLine();
                    if (res.isEmpty()) return;
                    ind = Integer.valueOf(res) - 1;
                } catch (Exception e) {
                }
                if ((ind >= 0) && (ind < journal.size()))
                    break;
            }
            journal.deleteTask(ind);
        this.execute();
    }
}
