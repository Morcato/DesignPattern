package Builder;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/4 10:10
 * @Description:
 */
public class SmartHumanBuilder implements HumanBuilder {

    Human human;

    public SmartHumanBuilder(){
        human = new Human();
    }

    public void buildHead() {
        human.setHead("聪明的大脑");
    }

    public void buildBody() {
        human.setBody("正常的躯干");
    }

    public void buildFoot() {
        human.setFoot("正常的脚");
    }

    public Human createHuman() {
        return human;
    }
}
