package com.venn;

/**
 * 完美单例模式
 *
 * @author dwf
 * @date 2021/3/8 21:36
 */
public class Singleton {

    /**
     * 私有化构造方法
     */
    private Singleton() {
    }

    /**
     * 创建内部类来专门实例化Singleton对象
     */
    private static class SingletonHelper {
        private final static Singleton INSTANCE = new Singleton();
    }

    /**
     * 对外提供获取对象的方法
     */
    public static Singleton getSingleton() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Singleton.getSingleton().hashCode())
            ).start();
        }
    }
}
