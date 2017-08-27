package Interfaces.filters;

/**
 * Created by hugansen on 2016/8/1.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public String process(Object input) {
        return input.toString();
    }
}
