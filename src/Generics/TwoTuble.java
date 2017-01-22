package Generics;

/**
 * Package:Generics
 * Author:20728
 * Created on 2017/1/22.
 */
public class TwoTuble<A, B> {
    // 虽然这里是public的变量
    // 但是final修饰符将保证其只在构造函数中修改
    // 其他情况下使用者无法修改此变量
    // 因此还是安全的
    public final A first;

    public final B second;

    public TwoTuble(A first, B second) {
        this.first = first;
        this.second = second;
    }
}
