package Threads.Mergesorter;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@AllArgsConstructor
public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> values = new ArrayList<Integer>();

    private ExecutorService executorService;

    @Override
    public List<Integer> call() throws Exception {

        if (values.size()==1){
            return values;
        }

        int mid = values.size()/2;

        List<Integer> left = values.subList(0,mid);
        List<Integer> right = values.subList(mid,values.size());

        MergeSorter leftSorter = new MergeSorter(left,executorService);
        MergeSorter rightSorter = new MergeSorter(right,executorService);

        Future<List<Integer>> leftfuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightfuture= executorService.submit(rightSorter);

        List<Integer> sortedleft = leftfuture.get();
        List<Integer> sortedright = rightfuture.get();

        return merge(sortedleft,sortedright);
    }

    public List<Integer> merge(List<Integer>A , List<Integer>B){
        List<Integer> tmp = new ArrayList<>();

        int n = A.size();
        int m = B.size();

        int i=0;
        int j=0;


        while(i<n && j<m){
            if(A.get(i) < B.get(j)){
                tmp.add(A.get(i));
                i++;
            }
            else{
                tmp.add(B.get(j));
                j++;
            }
        }
        while(i<n){
            tmp.add(A.get(i));
            i++;
        }
        while(j<m){
            tmp.add(B.get(j));
            j++;
        }

        return tmp;
    }
}
