
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by FurmanT on 10.11.2016.
 */


public enum View {
    ;
    static int num;

    public static void showMenu(MenuComponent menu) {
        if (menu instanceof Menu) {
            num++;
            boolean back = false;
            while (true) {
                System.out.println();
                System.out.println(menu.getName());
                System.out.println();
                int i = 1;
                for (MenuComponent m : menu) {
                    System.out.println(i++ + " - " + m.getName());
                }
                if (num > 1) System.out.println(i + " - Вернуться в предыдущее меню");
                while (true) {
                    i = getCommand() - 1;
                    if ((i >= 0) && (i < menu.getSize())) {
                        showMenu(menu.getChild(i));
                        break;
                    }
                    if ((i == menu.getSize()) && (num > 1)) {
                        back = true;
                        break;
                    }
                    System.out.println("Соответствующая команда не найдена, повторите ввод:");
                }
                if (back) {
                    num--;
                    break;
                }
            }
        }
        if (menu instanceof MenuItem) {
            menu.getAction();
        }
    }

    public static void showTask(Task task) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Дата наступления задачи: " + format.format(task.getDate().getTime()));
        System.out.println("Имя задачи: " + task.getName());
        System.out.println("Описание задачи: " + task.getDescription() + "\n");
    }


    public static int getCommand() {
        boolean er = true;
        int res = -1;
        Scanner in = new Scanner(System.in);

        while (er) {
            try {
                er = false;
                res = Integer.valueOf(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод команды, повторите ввод:");
                er = true;
            }
        }

        return res;
    }

    public static String getPath(){
        System.out.println("Введите путь до файла журнала:");
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        if (path.isEmpty()){
            System.out.println("Вы ввели пустой путь, повторите ввод!");
            return getPath();
        }
            else
        return path;
    }

}
