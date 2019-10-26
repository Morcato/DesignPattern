package Observer;

/**
 * 观察者模式（Observer）
 * @author shenzixing
 * @date 2019/9/2
 **/
public class Main {

    public static void main(String[] args) {
        MyObserver observer = new MyObserver();

        MySubject mySubject = new MySubject();
        mySubject.addObs(observer);
        mySubject.doAction();
    }

}
