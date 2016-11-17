import java.io.*;

/**
 * Created by FurmanT on 17.11.2016.
 */
public class JournalLoader {
    private Journal journal;
    private static JournalLoader instance;

    private JournalLoader(){

    }

    static {
        instance = new JournalLoader();
    }

    public static JournalLoader getInstance(){
        return instance;
    }


    public Journal getJournal() throws FileNotFoundException,IOException, ClassNotFoundException{
        if (journal == null)
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Journal.jr"));
            journal = (Journal) in.readObject();
            in.close();
            return journal;
        }
        catch(FileNotFoundException e) {throw new FileNotFoundException("Файл с журналом не найден!");}
        catch(IOException e) {throw new IOException("Ошибка при чтении журнала из файла!");}
        else
            return journal;
    }

    public void saveJournal() throws IOException{
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Journal.jr"));
            out.writeObject(journal);
            out.close();
        }
        catch(IOException e) {throw new IOException("Ошибка при записи журнала в файл!");}
    }

}
