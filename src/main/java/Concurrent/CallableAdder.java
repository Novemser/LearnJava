package Concurrent;

import java.util.concurrent.Callable;

/**
 * Alibaba Group
 * Created by 晨烛 on 2017/7/18.
 */
public class CallableAdder implements Callable<Integer> {
    Integer operand1;
    Integer operand2;

    public CallableAdder(Integer operand1, Integer operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Integer call() throws Exception {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName() +
                " says : partial Sum for " + operand1 + " and " + operand2 + " is " + (operand1 + operand2));
        return operand1 + operand2;
    }
}
