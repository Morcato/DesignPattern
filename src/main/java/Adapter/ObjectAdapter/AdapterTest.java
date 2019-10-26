package Adapter.ObjectAdapter;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/22 17:34
 * @Description: 结构模式---对象的适配器模式
 */
public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Adapter(source);
        targetable.method1();
        targetable.method2();
    }


}
