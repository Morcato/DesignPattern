package Builder;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/4 10:13
 * @Description:
 */
public class StrongHumanBuilder implements HumanBuilder {

    Human human;

    public StrongHumanBuilder() {
        human = new Human();
    }

    public void buildHead() {
        human.setHead("简单头脑");
    }

    public void buildBody() {
        human.setBody("强壮身体");
    }

    public void buildFoot() {
        human.setFoot("正常的脚");
    }

    public Human createHuman() {
        return human;
    }
}
