import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by FurmanT on 10.11.2016.
 */
public class Menu extends MenuComponent{
    private ArrayList<MenuComponent> menuItems;
    private String name;

    public static class Builder{
        private ArrayList<MenuComponent> items;
        private String name;

        public Builder(String name){
            this.name = name;
            this.items = new ArrayList<>();
        }

        public Builder addItem(MenuComponent item){
            this.items.add(item);
            return this;
        }

        public Menu build(){
            return new Menu(this);
        }
    }

    public Menu(Builder builder){
        name = builder.name;
        menuItems = builder.items;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getSize(){
        return menuItems.size();
    }

    @Override
    public MenuComponent getChild(int number){
        return menuItems.get(number);
    }

    public void add(MenuComponent menuItem, int num){
        menuItems.add(num,menuItem);
    }

    @Override
    public void remove(int num){
        menuItems.remove(num);
    }

    public Iterator iterator(){
        return menuItems.iterator();
    }

}
