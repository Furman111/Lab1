import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by FurmanT on 10.11.2016.
 */

public class ShowJournalAction implements Action {
    Journal journal;

    public ShowJournalAction(Journal jour){
        journal = jour;
    }

    public void execute(){
            for(int i=0;i<journal.size();i++)
                System.out.println(i+1 + ") "+journal.getTask(i).getName());
            System.out.println();
            System.out.println("Для подробного просмотра задачи введите её номер. Для возврата в главное меню нажмите Enter");
            int ind = -1;
            while (true) {
                Scanner in = new Scanner(System.in);
                try {
                    String res = in.nextLine();
                    if (res.isEmpty()) return;
                    ind = Integer.valueOf(res)-1;
                } catch (Exception e) {
                    System.out.println("Некорректный ввод, введите заново:");
                }
                if ((ind >= 0) && (ind < journal.size()))
                    break;
                else
                    System.out.println("Введен несуществующий номер задачи, повторите ввод:");
            }
            View.showTask(journal.getTask(ind));
            System.out.println("Для продолжения работы нажмите Enter");
            try{
                System.in.read();
            }
            catch(Exception e){}
            this.execute();
    }

}
