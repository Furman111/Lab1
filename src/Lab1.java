import java.io.*;
import java.util.Date;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Lab1 {
    public static void main(String[] args) {
        JournalLoader load = new JournalLoader();
        try {
            System.out.println(load.loadJournal().getTask(Long.valueOf(24)).getDescription());
            load.saveJournal();

        } catch (Exception e) {
            System.out.println("Err");
        }
    }
}
