
import java.util.Scanner;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class InterFace {
    private Menu menu;

    public InterFace(Menu menu){
        this.menu = menu;
    }

    public void showMenu(){
        System.out.println();
        System.out.println("Для выбора действия введите соответствующую цифру:");
        System.out.println();
        for (int i=0;i<menu.getAllItems().length;i++){
            System.out.println((i+1)+" - "+menu.getAllItems()[i].getName());
        }
        System.out.println();
    }

    public int getPush(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

}
