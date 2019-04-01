package com.twins.designpattern.singleton.register;

/**
 * Created on 2019/3/10
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object obj = ContainerSingleton.getBean("com.twins.designpattern.singleton.register.Pojo");
                    System.out.println(obj);
                }
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
