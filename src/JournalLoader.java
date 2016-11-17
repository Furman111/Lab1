import java.io.*;

/**
 * Created by FurmanT on 17.11.2016.
 */
public class JournalLoader {
    private Journal journal;

    public JournalLoader(){

    }

    public Journal getJournal(){
        return journal;
    }

    public Journal loadJournal() throws FileNotFoundException,IOException, ClassNotFoundException{
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Journal.jr"));
            journal = (Journal) in.readObject();
            in.close();
            return journal;
        }
        catch(FileNotFoundException e) {throw new FileNotFoundException("Файл с журналом не найден!");}
        catch(IOException e) {throw new IOException("Ошибка при чтении журнала из файла!");}
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
