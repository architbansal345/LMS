package Generics;

public class User<T,V> {
    public T first;
    public void doSomething(T first) {
        System.out.print("print Something" + first);
    }
}
