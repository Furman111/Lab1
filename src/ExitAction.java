import com.sun.corba.se.impl.orbutil.ObjectWriter;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class ExitAction implements Action {
    Journal journal;

    ExitAction(Journal j){
        journal = j;
    }

    public void execute(){}
}
