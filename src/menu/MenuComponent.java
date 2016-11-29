package menu;

/**
 * Created by FurmanT on 17.11.2016.
 */
public abstract class MenuComponent implements Iterable<MenuComponent>{

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public int getSize(){
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent component, int num){
        throw new UnsupportedOperationException();
    }

    public void remove(int num){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public void getAction(){
        throw new UnsupportedOperationException();
    }

}
