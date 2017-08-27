package FactoryDesignPattern;

/**
 * 简单工厂模式
 * 将一个具体类的实例化交给一个静态工厂方法来执行，它不属于GOF的23种设计模式，但现实中却经常会用到
 *
 * http://www.cnblogs.com/wangjq/archive/2012/07/02/2558255.html
 *
 * Created by hugansen on 2016/8/1.
 */
public class SimpleProductFactory {
    private static Product createProduct(int type) {
        Product product = null;
        switch (type) {
            case 0:
                product = new ConcreteProductA();
                break;
            case 1:
                product = new ConcreteProductB();
                break;
            default:
                break;
        }

        return product;
    }

    public static void main(String...args) {
        createProduct(1);
        createProduct(1);
        createProduct(1);
        createProduct(0);
        createProduct(0);
        createProduct(1);
        createProduct(1);
        createProduct(0);
    }
}

abstract class Product {
    Product() {
    }

    abstract void operation();
}

class ConcreteProductA extends Product {
    ConcreteProductA() {
        System.out.println("ProductA created");
    }

    @Override
    void operation() {

    }
}

class ConcreteProductB extends Product {
    ConcreteProductB() {
        System.out.println("ProductB created");

    }

    @Override
    void operation() {

    }
}
