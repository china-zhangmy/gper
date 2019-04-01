package com.twins.designpattern.singleton.register;

/**
 * Created on 2019/3/10
 * <p>
 * 枚举注册式单例
 * <p>
 * 特征：
 * 饿汉式单例——通过jad反编译工具对class文件进行反编译可观测到，枚举注册式单例是采用饿汉式单例去实现，因此是线程安全的。
 * 如何避免通过反序列化破坏单例？
 * 在对象被反序列化（ObjectInputStream.readObject()）过程中，当确认被反序列化对象的字节码是
 * ObjectStreamConstants.TC_ENUM时（ObjectInputStream.BlockDataInputStream.peekByte()==ObjectStreamConstants.TC_ENUM），
 * 可观测到对象在被反序列化的过程中是通过Enum.valueOf(Class<T>, String)方法直接从JVM内存中获取的，而该实例是通过饿汉
 * 式单例注册到JVM内中中的，因此可以防止单例不被破坏。
 * 如何避免通过反射破坏单例？
 * 1） 当调用无参构造方法进行反射时，会抛出"java.lang.NoSuchMethodException"阻止单例被破坏
 * <code>
 * Class clazz = EnumSingleton.class;
 * Constructor c = clazz.getDeclaredConstructor();
 * c.setAccessible(true);
 * // 抛出异常——java.lang.NoSuchMethodException: com.twins.designpattern.singleton.register.EnumSingleton.<init>()
 * EnumSingleton obj = (EnumSingleton)c.newInstance();
 * </code>
 * 2）当调用有参构造方式进行反射时，会抛出"java.lang.IllegalArgumentException"阻止单例被破坏
 * <code>
 * Class clazz = EnumSingleton.class;
 * Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
 * c.setAccessible(true);
 * // 抛出异常——java.lang.IllegalArgumentException: Cannot reflectively create enum objects
 * EnumSingleton obj = (EnumSingleton)c.newInstance("INSTANCE", 0);
 * </code>
 * <p>
 * 结论：从JDK层面就为枚举不被反序列化和反射提供底层支持。
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
