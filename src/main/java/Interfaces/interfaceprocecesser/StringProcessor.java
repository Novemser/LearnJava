package Interfaces.interfaceprocecesser;

import java.util.Arrays;

/**
 * Created by hugansen on 2016/8/1.
 */
public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    /**
     * 好神奇 这个重写的返回值可以和基类的返回值不一样
     *
     * @param input 输入一个需要处理的对象
     * @return nothing
     */
    @Override
    public abstract String process(Object input);

    public static String s = "Ifj jkad hu ujj kas nk kjh jk .";

    public static void main(String... args) {
        Apply.process(new UpCase(), s);
        Apply.process(new DownCase(), s);
        Apply.process(new Splitter(), s);
    }
}

class UpCase extends StringProcessor {

    /**
     * 转换成大写
     * @param input 输入一个需要处理的对象
     * @return 你猜
     */
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class DownCase extends StringProcessor {

    /**
     * 你猜
     * @param input 输入一个需要处理的对象
     * @return
     */
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    /**
     * 你猜 哦
     * @param input 输入一个需要处理的对象
     * @return
     */
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}