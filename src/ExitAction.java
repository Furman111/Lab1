/**
 * Created by FurmanT on 10.11.2016.
 */
public class ExitAction implements Action {
    private Journal journal;

    ExitAction(Journal j){
        journal = j;
    }

    public void execute(){
        try {
           JournalLoader.getInstance().saveJournal();
        }
        catch(Exception e){
            View.throwException(e);
        }
        System.exit(0);
    }
}
