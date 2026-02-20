package MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>>  {
    private List<Integer> arraytoSort;
    private ExecutorService executorService;
    public  Sorter(List<Integer>arraytoSort , ExecutorService executorService){
        this.arraytoSort = arraytoSort;
        this.executorService = executorService;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arraytoSort.size() <= 1){
            return arraytoSort;
        }
        int mid = arraytoSort.size()/2;
        List<Integer>leftArr = new ArrayList<>(arraytoSort.subList(0,mid));
        List<Integer>rightArr = new ArrayList<>(arraytoSort.subList(mid,arraytoSort.size()));

        Sorter leftSorter = new Sorter(leftArr , executorService);
        Sorter rightSorter = new Sorter(rightArr , executorService);

        Future<List<Integer>>futureLeftArr =  executorService.submit(leftSorter);
        Future<List<Integer>>futureRightArr = executorService.submit(rightSorter);

        List<Integer> leftSorted = futureLeftArr.get();
        List<Integer> rightSorted = futureRightArr.get();
        return merge(leftSorted , rightSorted);
    }
    private List<Integer> merge(List<Integer>A , List<Integer>B){
        List<Integer>merged = new ArrayList<>();
        int i = 0 , j = 0;
        while(i< A.size() && j<B.size()){
            if(A.get(i) <= B.get(j)){
                merged.add(A.get(i));
                i++;
            }else{
                merged.add(B.get(j));
                j++;
            }
        }
        while(i<A.size())merged.add(A.get(i++));
        while(j<B.size())merged.add(B.get(j++));
        return merged;
    }
}
