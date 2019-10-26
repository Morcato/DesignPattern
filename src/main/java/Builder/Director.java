package Builder;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/4 10:15
 * @Description:
 */
public class Director {

    public Human createHumanByDirector(HumanBuilder humanBuilder){
        humanBuilder.buildBody();
        humanBuilder.buildFoot();
        humanBuilder.buildHead();
        return humanBuilder.createHuman();
    }
}
