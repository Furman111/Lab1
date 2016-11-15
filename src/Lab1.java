import java.io.IOException;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Lab1 {
    public static void main(String[] args){
        Menu menu = new Menu();
        MenuItem item = new MenuItem("Добавить задачу");
        MenuItem c = new MenuItem("Удалить задачу");
        MenuItem d = new MenuItem("Вывести журнал задач");
        MenuItem e = new MenuItem("Выйти из программы");
        a.addItem(b,0);
        a.addItem(c,1);
        a.addItem(d,2);
        a.addItem(e,3);
        InterFace i = new InterFace(a);
        i.showMenu();
        while (i.getPush() != 4)
            i.showMenu();
    }
}
