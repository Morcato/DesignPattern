package Adapter.ClassAdapter;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/22 17:19
 * @Description: 结构模式---对象的适配器模式 让targetable接口的实现类拥有了Source类的功能
 * 当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Adapter类，持有原类的一个实例，在Adapter类的方法中，调用实例的方法就行。
 * 本例中希望将Tatgetable接口实现,并具有Source类的方法,则让Adapte拥有了Source实例子来实现method1,实现了Targetable以此来达到目标
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
