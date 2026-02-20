package Generics;

public class Testing<T,V> {
    private T first;
    private V second;
    public Testing(T first , V second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
