package DesignPatterns.Singleton;

/**
 * Created by Novemser on 2016/9/20.
 */
public class InitializationOnDemandHolder {

    private InitializationOnDemandHolder() {}

    private static class InstanceHolder {
        private static final InitializationOnDemandHolder INSTANCE =
                new InitializationOnDemandHolder();
    }

    public static InitializationOnDemandHolder getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
