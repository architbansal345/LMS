package Lab;

import java.util.List;
import java.util.concurrent.Callable;

public class MultiThreaded implements Callable<Integer> {
    public List<Integer> arr;
    public int start , end;
    public MultiThreaded(List<Integer> arr , int start , int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    public Integer call() throws Exception {
        int ans = 0;
        for(int i = start ; i<end ; i++){
            ans += arr.get(i);
        }
        return ans;
    }
}
