package Singleton.LazySington;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/2 18:25
 * @Description: 创建型模式 --- 懒汉式单例(线程不安全)  不建议使用!
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 缺点:很明显,在多线程情况下,初始化instance时可能会出错
 */
public class SimpleSingtonNotSafe {

    private static SimpleSingtonNotSafe instance;

    private SimpleSingtonNotSafe() {

    }

    public static SimpleSingtonNotSafe getInstance() {
        if (instance == null) {
            instance = new SimpleSingtonNotSafe(); //多线程情况下,在初始化单例时会出错
        }
        return instance;
    }

}
