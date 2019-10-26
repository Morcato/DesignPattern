package Adapter.ObjectAdapter;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/22 17:28
 * @Description:
 */
public class Adapter implements Targetable{

    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    public void method1() {
         source.method1();
    }

    public void method2() {
        System.out.println("I am method2() in interface Targetable");
    }
}
