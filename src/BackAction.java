/**
 * Created by FurmanT on 19.11.2016.
 */
public class BackAction implements Action {
    private MenuComponent prev;

    public BackAction(MenuComponent prev){
        this.prev = prev;
    }

    public void execute(){
        View.showMenu(prev);
    }
}
