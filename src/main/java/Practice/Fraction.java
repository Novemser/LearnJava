package Practice;

import java.util.Scanner;

/**
 * LearnJava
 * <p>
 * Created by Jingxin on 2016/10/5.
 */
public class Fraction {

    int numerator;
    int denominator;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入分子和分母（用空格隔开)：");

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        Fraction fraction = new Fraction(a, b);
        fraction.Simple();

        System.out.print("约分后为："+fraction.toString());
    }

    public Fraction(int x, int y) {
        this.numerator = x;
        this.denominator = y;
    }//初始化分子分母

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }//转换为分数格式

    public void Simple() {
        int i = this.numerator;
        if (i > this.denominator) {
            i = this.denominator;
        }
        for (; i >= 1; --i) {
            if (this.numerator % i == 0 && this.denominator % i == 0)
                break;
        }
        this.numerator /= i;
        this.denominator /= i;
    }//约分
}
