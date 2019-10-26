package Singleton.StarveSington;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/2 19:46
 * @Description: 创建型模式 --- 饿汉式单例(线程安全)  这种方式比较常用，但实例一开始就初始化,容易产生垃圾对象,在不需要懒汉式初始化时可以使用。
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * 优点:由于没有加锁所以效率很高,并且线程安全
 * 缺点:类加载时就初始化，浪费内存。
 */
public class StarveSingtion {

    public static StarveSingtion instance = new StarveSingtion();

    private StarveSingtion() {

    }

    public StarveSingtion getInstance() {
        return instance;
    }

}
