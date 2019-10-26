package Bridge;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/28 19:01
 * @Description: 结构模式---桥接模式
 * 通过让Shape类中拥有Color这个接口来实现只需要换color就可以换颜色,将形状与颜色分离开来
 */
public class Main {

    public static void main(String[] args) {
        Color color = new Blue();
        Shape circle = new Circle(color);
        circle.drawOneShape();
        System.out.println("==============");
        //换一种颜色
        circle.setColor(new Red());
        circle.drawOneShape();
    }

}
