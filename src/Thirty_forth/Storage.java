package Thirty_forth;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<String> items;
    private static volatile Storage instance;

    public Storage() {
        items = new ArrayList<>();
    }

    public static Storage getInstance(){
        synchronized (Storage.class) {
            if (instance == null) {
                System.out.println("creating instance");
                instance = new Storage();
            }
            return instance;
        }
    }

    public List<String> getItems(){
        return items;
    }

    public synchronized void addItem(String item){
        items.add(item);
    }
}
