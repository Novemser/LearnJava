package Native;

/**
 * Package:Native
 * Author:20728
 * Created on 2017/1/30.
 */
public class NativeHelloWorld {
    public native void sayHello();

    static {
        System.loadLibrary("sayHello");
    }

    public static void main(String[] args) {
        new NativeHelloWorld().sayHello();
    }
}
