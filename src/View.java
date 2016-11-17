
import java.util.Scanner;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class View {

    public static void showMenu(MenuComponent menu) {
        System.out.println();
        System.out.println(menu.getName());
        System.out.println();
        int i = 1;
        for (MenuComponent m : menu) {
            System.out.println(i++ + " - " + m.getName());
        }
        while (true) {
            i = getCommand()-1;
            if ((i >= 0) && (i < menu.getSize())) {
                try{
                    menu.getChild(i).getAction();
                }
                catch(UnsupportedOperationException e) {}
                try{
                    showMenu(menu.getChild(i));
                }
                catch(UnsupportedOperationException e) {}
                break;
            }
        }
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
