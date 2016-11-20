import java.util.Iterator;

/**
 * Created by FurmanT on 10.11.2016.
 */

public class MenuItem extends MenuComponent{
    private String name;
    private Action action;

    public MenuItem(String name,Action act){
        this.name = name;
        action = act;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void getAction(){
        action.execute();
    }

    @Override
    public Iterator iterator(){
        return new NullIterator();
    }

    public class NullIterator implements Iterator{

        public boolean hasNext(){
            return false;
        }

        public Object next(){
            return null;
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }

    }

}
