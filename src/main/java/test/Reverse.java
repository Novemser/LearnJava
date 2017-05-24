package test;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2016/10/7
 */
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number,n;
        Scanner in=new Scanner (System.in);
        System.out.print("Enter a positive integer:");
        number=in.nextInt();

        if (number<0){
            System.out.println("Sorry,it isn't a positive integer!");}
        else {
            if(number<=1)
                System.out.print("Covert to Binary or Hexadecimal is:"+number);
            else{
                Scanner tr=new Scanner(System.in);
                System.out.print("Select:1.to Binary 2.to Hexadecimal");
                n=tr.nextInt();

                if (n==1){
                    System.out.println("Covert to Binary is:");
                    printBinary(number);
                }
                else{
                    System.out.println("Covert to Hexadecimal is:");
                    printHex(number);
                }
            }
        }
    }

    public static void printBinary(int number)
    {
        int binary[]=new int[40];
        int index=0;
        binary[index++]=number%2;
        number=number/2;

        for (int i=index-1;i>0;i++)
        {
            System.out.print(+binary[i]);
        }
    }

    public static String printHex(int number)
    {
        int hexadecimal[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex="";
        while(number!=0)
        {
            int rem=number%16;
            hex=hexadecimal[rem]+hex;
            number=number/16;
        }
        return hex;
    }
}
