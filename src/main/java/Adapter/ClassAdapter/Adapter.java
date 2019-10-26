package Adapter.ClassAdapter;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/22 17:15
 * @Description:
 */
public class Adapter extends Source implements Targetable{

    public void method2() {
        System.out.println("I am method2() in interface Targetable");
    }
}
