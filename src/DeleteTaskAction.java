/**
 * Created by FurmanT on 10.11.2016.
 */
public class DeleteTaskAction implements Action {
    private Journal journal;
    private int num;

    public DeleteTaskAction(Journal j, int number){
        journal = j;
        num = number;
    }

    public void execute(){

    }
}
