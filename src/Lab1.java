import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Lab1 {
    public static void main(String[] args) {
        try {
            View.showMenu(MenuCreator.menu());
        } catch (Exception e) {
            View.throwException(e);
        }
        finally {
            try {
                JournalLoader.getInstance().saveJournal();
            }
            catch(IOException e){
                View.throwException(e);
            }
        }
    }
}
