package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class client {
    public static void main(String[] args) {
        int x = 10;
        Runnable r = () -> System.out.println(x);
        Thread t = new Thread(r);
        t.start();
    }
}
