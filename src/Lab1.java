/**
 * Created by FurmanT on 10.11.2016.
 */
public class Lab1 {
    public static void main(String[] args) {
        try {
            View.showMenu(MenuCreator.Create());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
