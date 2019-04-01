package com.twins.designpattern.singleton.register;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created on 2019/3/10
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());

        try {
            FileOutputStream fos = new FileOutputStream("./design-pattern/design-pattern-singleton/src/main/java/com/twins/designpattern/singleton/register/EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.close();

            FileInputStream fis = new FileInputStream("./design-pattern/design-pattern-singleton/src/main/java/com/twins/designpattern/singleton/register/EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(s1.getData());
        System.out.println(s2.getData());
        System.out.println(s1.getData() == s2.getData());
    }
}
