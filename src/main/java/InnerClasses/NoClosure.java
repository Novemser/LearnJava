package InnerClasses;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hugansen on 2016/8/3.
 */

interface Block<T> {
    void invoke(T arg);
}

class Utils {
    public static <T> void forEach(Iterable<T> seq, Block<T> func) {
        for(T element: seq) {
            func.invoke(element);
        }
    }
}

public class NoClosure {
    public static void main(String... args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Block<Integer> block = new Block<Integer>() {
            @Override
            public void invoke(Integer arg) {
                System.out.println("Arg:" + arg);
            }
        };

        Utils.forEach(list, block);
    }
}
