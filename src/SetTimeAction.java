import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by FurmanT on 19.11.2016.
 */
public class SetTimeAction implements Action{
    private Task task;

    public SetTimeAction(Task task){
        this.task = task;
    }

    public void execute(){
        try {
            System.out.println("Введите дату и время планируемой задачи в формате: день месяц год часы минуты:");
            Scanner scan = new Scanner(System.in);
            int dd = 0, MM = 0, yyyy = 0, hh = 0, mm = 0;
            dd = scan.nextInt();
            MM = scan.nextInt();
            yyyy = scan.nextInt();
            hh = scan.nextInt();
            mm = scan.nextInt();
            task.setDate(new GregorianCalendar(yyyy, MM, dd, hh, mm));
        }
        catch (InputMismatchException e){View.throwException(e);}
    }
}
