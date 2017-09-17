package CPUOptimization;

import java.util.Random;

/**
 * Project: LearnJava
 * Package: CPUOptimization
 * Author:  Novemser
 * 2017/9/17
 */
public class BranchPrediction {
    private static final int MOD = 256;

    public static void main(String[] args) {
        final int dataSize = 32768;
        int[] data = new int[dataSize];

        Random random = new Random();
        for (int i = 0; i < dataSize; i++) {
            data[i] = random.nextInt() % MOD;
        }

        long start = System.currentTimeMillis();
        long sum = 0;

        // Branch prediction
//        Arrays.sort(data);

        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < dataSize; j++) {
                if (data[j] < 128) {
                    sum += data[j];
                }
            }
        }

        System.out.println("Time elapsed:" + (System.currentTimeMillis() - start));
        System.out.println("Sum:" + sum);
    }
}
