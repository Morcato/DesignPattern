package Observer;

/**
 * @author shenzixing
 * @date 2019/9/2
 **/
public interface Subject {

    void addObs(Observer o);

    void delObs(Observer o);

    void callObs();


}
