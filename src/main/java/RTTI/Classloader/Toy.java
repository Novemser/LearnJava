package RTTI.Classloader;

/**
 * Package:RTTI.Classloader
 * Author:20728
 * Created on 2016/10/31.
 */
public class Toy {
    private String name;

    public static final int price = 10;

    static {
        System.out.println("Initializing");
    }

    Toy() {
        System.out.println("Building");
    }

    Toy(String name) {
        this.name = name;
    }

    public String playToy(String player) {
        String msg = buildMsg(player);
        System.out.println(msg);
        return msg;
    }

    private String buildMsg(String player) {
        return player + " plays " + name;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("RTTI.Classloader.Toy");
    }
}
