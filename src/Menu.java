/**
 * Created by FurmanT on 10.11.2016.
 */
public class Menu {
    private MenuItem menuItems[];

    public Menu(MenuItem[] menuItems1){
        menuItems = menuItems1;
    }

    public Menu(){}

    public MenuItem[] getAllItems(){
        return menuItems;
    }

    public int getNumberOfItems(){
        return menuItems.length;
    }

    public MenuItem getItem(int number){
        return menuItems[number];
    }

    public void addItem(MenuItem menuItem,int num){
        if (menuItems!=null) {
            MenuItem[] t = new MenuItem[menuItems.length + 1];
            for (int i = 0; i < num; i++)
                t[i] = menuItems[i];
            t[num] = menuItem;
            for (int i = num + 1; i < menuItems.length + 1; i++) {
                t[i] = menuItems[i - 1];
            }
            menuItems = t;
        }
        else
            menuItems =new MenuItem[] {menuItem};
    }

    public void deleteItem(int num){
        MenuItem[] t = new MenuItem[menuItems.length-1];
        for (int i=0;i<num;i++)
            t[i] = menuItems[i];
        for(int i=num;i<menuItems.length-1;i++)
            t[i]=menuItems[i+1];
        menuItems = t;
    }

}
