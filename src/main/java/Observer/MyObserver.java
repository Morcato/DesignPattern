package Observer;

/**
 * @author shenzixing
 * @date 2019/9/2
 **/
public class MyObserver implements Observer {

    public void doUpdate() {
        System.out.println("观察者收到监听消息!");
    }
}
