/**
 * Created by FurmanT on 10.11.2016.
 */
public class DeleteTaskAction implements Action {
    Journal journal;
    int num;

    public DeleteTaskAction(Journal j,int number){
        journal = j;
        num = number;
    }

    public void execute(){
        journal.deleteTask(num);
    }
}
