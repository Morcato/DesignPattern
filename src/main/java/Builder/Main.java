package Builder;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/4 10:18
 * @Description: 创建型模式---建造者模式
 *
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Human human = director.createHumanByDirector(new SmartHumanBuilder());
        System.out.println(human);
    }
}
