package com.twins.designpattern.singleton.serializable;

import java.io.Serializable;

/**
 * Created on 2019/3/10
 * <p>
 * 反序列化时导致单例破坏
 * <p>
 * 序列化：把Java对象的状态通过字节码转换的形式，通过I/O流从内存中写入到其他地方（磁盘、网络I/O），以便把状态永久保存下来
 * 反序列化：将已经持久化的对象字节码通过I/O流读取，进而将读取的内容转化为Java对象，在转换过程中会通过new关键字重新创建对象
 */
public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton INSTANCE = new SerializableSingleton(); //饿汉式单例

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 在对象被反序列化（ObjectInputStream.readObject()）过程中，当确认被反序列化对象的字节码是ObjectStreamConstants.TC_OBJECT
     * 时（ObjectInputStream.BlockDataInputStream.peekByte()==ObjectStreamConstants.TC_OBJECT），可观测到对象在被反序列化
     * 的过程中如该类可被实例化，则通过ObjectStreamClass.newInstance()创建一个新的对象，如此便破坏了单例。
     * readResolve方法可用于防止反序列化破坏单例，根本原因不过是用其返回值（即单例对象）覆盖了被反序列化出来的对象；对象还是
     * 被创建了两次，不过创建过程是发生在JVM层面，固相对来说比较安全；之前反序列化出来的对象会被GC回收。
     * ObjectStreamClass.hasReadResolveMethod()作为关键步骤用以确认反序列化时单例是否可被破坏。
     *
     * @return
     */
    private Object readResolve() {
        return INSTANCE;
    }
}
