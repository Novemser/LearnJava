package Concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Alibaba Group
 * Created by 晨烛 on 2017/7/18.
 */
public class ParallelAdder {
    public Integer parallelSum() {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        List<Future<Integer>> list = new ArrayList<>();
        int count = 1;
        int prev = 0;

        for (int i = 1; i <= 100; i++) {
            if (count % 2 == 0) {
                System.out.println("Prev:" + prev + " current:" + i);
                Future<Integer> future = executor.submit(new CallableAdder(prev, i));
                list.add(future);
                count = 1;
                continue;
            }
            count++;
            prev = i;
        }
        int totalSum = 0;
        for (Future<Integer> future : list) {
            try {
                totalSum += future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("TotalSumIs:" + totalSum);
        return totalSum;
    }

    public int sequentialSum() {
        //long t1 = System.currentTimeMillis();
        Integer totalSum = 0;
        for (int i = 1; i <= 100; i++) {
            totalSum = totalSum + i;
        }
        //long t2 = System.currentTimeMillis();
        System.out.println("sequentialSum Total Sum is " + totalSum);
        //System.out.println("Time taken by sequentialSum " + (t2-t1));
        return totalSum;
    }

    public static void main(String[] args) {
        ParallelAdder adder = new ParallelAdder();
        int pSum = adder.parallelSum();
        int sSum = adder.sequentialSum();
        System.out.println("parallel Sum equals to Sequential Sum ? ");
        System.out.println("Answer is :: " + (pSum == sSum));
    }
}
