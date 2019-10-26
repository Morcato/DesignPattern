package SimpleFactory;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/30 16:46
 * @Description: 创建型模式---简单工厂模式
 */
public class Main {

    public static void main(String args[]) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("triangle");
        shape3.draw();

    }
}
