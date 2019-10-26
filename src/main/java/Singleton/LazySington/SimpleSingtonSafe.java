package Singleton.LazySington;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/2 18:34
 * @Description: 创建型模式 --- 懒汉式单例(线程安全)  不建议使用!
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 缺点:虽然线程安全了,但是每次将getInstance方法锁起来会导致效率变低,其实只有第一次初始化的时候才需要锁住
 */
public class SimpleSingtonSafe {

    private static SimpleSingtonSafe instance;

    private SimpleSingtonSafe() {

    }

    public static synchronized SimpleSingtonSafe getInstance() {
        if (instance == null) {

            instance = new SimpleSingtonSafe();
        }
        return instance;
    }

}
