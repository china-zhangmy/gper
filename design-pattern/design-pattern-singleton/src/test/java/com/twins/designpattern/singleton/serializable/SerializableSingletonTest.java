package com.twins.designpattern.singleton.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created on 2019/3/10
 */
public class SerializableSingletonTest {

    public static void main(String[] args) {
        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        try {
            FileOutputStream fos = new FileOutputStream("./design-pattern/design-pattern-singleton/src/main/java/com/twins/designpattern/singleton/serializable/SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.close();

            FileInputStream fis = new FileInputStream("./design-pattern/design-pattern-singleton/src/main/java/com/twins/designpattern/singleton/serializable/SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
