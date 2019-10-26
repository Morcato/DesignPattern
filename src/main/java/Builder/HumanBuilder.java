package Builder;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/4 10:05
 * @Description:
 */
public interface HumanBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    public Human createHuman();

}
