
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by FurmanT on 10.11.2016.
 */


public class View {

    public static void showMenu(MenuComponent menu) {
        if (menu instanceof Menu) {
            while (true) {
                System.out.println();
                System.out.println(menu.getName());
                System.out.println();
                int i = 1;
                for (MenuComponent m : menu) {
                    System.out.println(i++ + " - " + m.getName());
                }
                while (true) {
                    i = getCommand() - 1;
                    if ((i >= 0) && (i < menu.getSize())) {
                        showMenu(menu.getChild(i));
                        break;
                    }
                    System.out.println("Соответствующая команда не найдена, повторите ввод:");
                }
            }
        }
        if (menu instanceof MenuItem) {
            menu.getAction();
        }
    }

    public static void showTask(Task task){
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println(format.format(task.getDate().getTime())+" "+task.getName());
        System.out.println(task.getDescription()+"\n");
    }


    public static int getCommand() {
        Scanner in = new Scanner(System.in);
        int res = in.nextInt();
        return res;
    }

    public static void throwException(Exception e) {
        System.out.println(e.toString());
    }

}
