package Singleton.LazySington;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/2 19:53
 * @Description: 创建型模式---静态内部类式单例   推荐使用这种方式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 * 优点:懒汉式初始化,同时保证了效率
 * 通过静态内部类的方式保证可以做到需要单例时才加载,同时线程安全效率也很高
 * (静态内部类只有调用时才会实例化,因此可以做到延迟加载实例,同时保证线程安全)
 */
public class SingtonIternalClass {

    private SingtonIternalClass() {

    }

    private static class SingtonFactory {
        private static SingtonIternalClass instance = new SingtonIternalClass();
    }

    public SingtonIternalClass getInstance() {
        return SingtonFactory.instance;
    }
}
