/**
 * Created by FurmanT on 10.11.2016.
 */
public class MenuItem {
    private String name;
    private Action action;

    public MenuItem(String name,Action act){
        this.name = name;
        action = act;
    }

    public MenuItem(String a){
        name = a;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void getAction(){
        action.execute();
    }
}
