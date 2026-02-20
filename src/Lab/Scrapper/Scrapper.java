package Lab.Scrapper;

import java.util.concurrent.Callable;

public class Scrapper implements Callable<Void> {
    private String url;
    public Scrapper(String url){
        this.url = url;
    }
    public Void call(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
