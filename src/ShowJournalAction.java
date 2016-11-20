import java.io.IOException;

/**
 * Created by FurmanT on 10.11.2016.
 */

public class ShowJournalAction implements Action {
    Journal journal;

    public ShowJournalAction(Journal jour){
        journal = jour;
    }

    public void execute(){
        int j=1;
        for (Task i: journal){
            System.out.print(j++ +". ");
            View.showTask(i);
        }
        System.out.println("Для продолжения работы нажмите Enter...");
        try {
            System.in.read();
        }
        catch(IOException e){}
    }
}
