package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenzixing
 * @date 2019/9/2
 **/
public class MySubject implements Subject{

    List<Observer> observers = new ArrayList<Observer>();

    public void addObs(Observer o) {
        observers.add(o);
    }

    public void delObs(Observer o) {
        observers.remove(o);
    }

    public void callObs() {
        for (Observer observer : observers){
            observer.doUpdate();
        }
    }

    public void doAction(){
        System.out.println("被观察者执行任务");
        callObs();
    }

}
