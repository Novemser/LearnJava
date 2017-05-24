package Serializable;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Project: LearnJava
 * Package: Serializable
 * Author:  Novemser
 * 2016/10/13
 *
 * 使用transient关键字不序列化某个变量
 * 注意读取的时候，读取数据的顺序一定要和存放数据的顺序保持一致
 */
public class TransientTest {

    public static void main(String[] args) {

        User user = new User();
        user.setUsername("Alexia");
        user.setPasswd("123456");

        System.out.println("read before Serializable: ");
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPasswd());
        System.out.println("member: " + user.getMember());
        user.pulsMember();

        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("F:/user.txt"));
            os.writeObject(user); // 将User对象写进文件
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // 在反序列化之前改变username的值
            User.username = "jmwang";

            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    "F:/user.txt"));
            user = (User) is.readObject(); // 从流中读取User的数据
            is.close();

            System.out.println("\nread after Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.out.println("password: " + user.getPasswd());
            System.out.println("member: " + user.getMember());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private static final long serialVersionUID = 8294180014912103005L;

    public int member = 0;

    public static String username;

    private transient String passwd;

    public void pulsMember() {
        member++;
    }

    public int getMember() {
        return member;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}