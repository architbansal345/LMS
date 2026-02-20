package Semaphores;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final int maxSize;
    private final List<Object> items;
    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }
    public void addItems(Object item){
        items.add(item);
        System.out.println("Producer is producing" + item);
    }
    public void removeItems(){
        items.removeLast();
        System.out.println("Consumer is consuming");
    }
}
