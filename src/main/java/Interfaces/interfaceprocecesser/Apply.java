package Interfaces.interfaceprocecesser;

/**
 * Created by hugansen on 2016/8/1.
 */
public class Apply {
    public static void process(Processor processor, Object obj) {
        System.out.println("Using processor" + processor.name());
        System.out.println(processor.process(obj));
    }
}
