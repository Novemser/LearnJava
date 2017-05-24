package Interfaces.interfaceprocecesser;

import Interfaces.Month;
import Interfaces.filters.Filter;

/**
 * Created by hugansen on 2016/8/1.
 */
public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public String process(Object input) {
        return filter.process(input);
    }

    public static void main(String...args){

        // 类似于代理，进行封装
        Processor processor = new FilterAdapter(new Filter());
        Apply.process(processor, "haha hjthahaha 23333");
    }
}
