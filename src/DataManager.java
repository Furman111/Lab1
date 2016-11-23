import java.io.*;
import java.util.Scanner;

/**
 * Created by FurmanT on 17.11.2016.
 */
public enum DataManager {
    ;
    private static Journal journal;
    private static String path = null;

    public static Journal loadJournal(String path1) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(path1));
            journal = (Journal) in.readObject();
            in.close();
            path = path1;
        } catch (FileNotFoundException e) {
            System.out.println("Файл с журналом не найден!");
            System.out.println();
            Scanner in = new Scanner(System.in);
            System.out.println("Для изменения пути к журналу введите 1");
            System.out.println("Для создания нового журнала введите 2");
            System.out.println("Для выхода из программы введите 3");
            boolean er = true;
            while (er) {
                try {
                    er = false;
                    int res = in.nextInt();
                    if (res == 2) {
                        journal = new Journal();
                        path = null;
                        return journal;
                    }
                    if (res == 3) System.exit(1);
                    if (res != 1) er = true;
                } catch (Exception exc) {
                    er = true;
                }
            }
            journal = loadJournal(View.getPath());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении журнала из файла!");
            System.out.println();
            Scanner in = new Scanner(System.in);
            System.out.println("Для изменения пути к журналу введите 1");
            System.out.println("Для создания нового журнала введите 2");
            System.out.println("Для выхода из программы введите 3");
            boolean er = true;
            while (er) {
                try {
                    er = false;
                    int res = in.nextInt();
                    if (res == 2) {
                        journal = new Journal();
                        path = null;
                        return journal;
                    }
                    if (res == 3) System.exit(1);
                    if (res != 1) er = true;
                } catch (Exception exc) {
                    er = true;
                }
            }
            journal = loadJournal(View.getPath());
        } catch (ClassNotFoundException e) {
            System.out.println("В указанном файле отсутствуют необходимые данные!");
            System.out.println();
            Scanner in = new Scanner(System.in);
            System.out.println("Для изменения пути к журналу введите 1");
            System.out.println("Для создания нового журнала введите 2");
            System.out.println("Для выхода из программы введите 3");
            boolean er = true;
            while (er) {
                try {
                    er = false;
                    int res = in.nextInt();
                    if (res == 2) {
                        journal = new Journal();
                        path = null;
                        return journal;
                    }
                    if (res == 3) System.exit(1);
                    if (res != 1) er = true;
                } catch (Exception exc) {
                    er = true;
                }
            }

            journal = loadJournal(View.getPath());
        }
        path = path1;
        return journal;
    }

    public static Journal startingLoad() {
        Scanner in = new Scanner(System.in);
        System.out.println("Для выполнения действия введите соответствующую цифру:");
        System.out.println("1 - Загрузить журнал из существующего файла");
        System.out.println("2 - Создать новый журнал для сохранения в новый файл в будущем");
        System.out.println("3 - Выйти из программы");
        boolean er = true;
        while (er) {
            try {
                er = false;
                int res = in.nextInt();
                if (res == 2) {
                    journal = new Journal();
                    path = null;
                } else
                    if (res == 3) System.exit(0);
                    else
                        if (res == 1) journal = loadJournal(View.getPath());
                        else
                            er = true;
            } catch (Exception exc) {
                er = true;
            }
        }
        return journal;
    }

    public static Journal getJournal() {
        if (journal == null)
            return loadJournal(View.getPath());
        else
            return journal;
    }

    public static void saveJournal(String path) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
            out.writeObject(journal);
            out.close();
        } catch (IOException e) {
            System.out.println("Не удалось сохранить журнал в файл!");
            System.out.println("Для сохранения журнала в другой файл нажмите 1\nДля выхода из программы без сохранения результатов работы нажмите 2:");
            Scanner in = new Scanner(System.in);
            boolean er = true;
            while (er) {
                try {
                    er = false;
                    int res = in.nextInt();
                    if (res == 2) System.exit(666);
                    if (res != 1) er = true;
                } catch (Exception exc) {
                    er = true;
                }
            }
            saveJournal(View.getPath());
        }
    }

    public static String getPath(){
        return path;
    }
}
