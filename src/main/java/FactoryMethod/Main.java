package FactoryMethod;

import FactoryMethod.factory.CircleFactory;
import FactoryMethod.factory.SquareFactory;
import FactoryMethod.factory.TriangleFactory;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 09:52
 * @Description: 创建型模式---工厂方法模式
 * 由于简单工厂模式在拓展新的产品类时,需要对工厂直接修改,不符合闭包的原则
 * 因此使用工厂方法模式,每当需要拓展一个新的类时,只需要新建一个工厂类即可
 */
public class Main {

    public static void main(String args[]) {
        Provider provider1 = new CircleFactory();
        Shape circle = provider1.getShape();
        circle.draw();
        Provider provider2 = new SquareFactory();
        Shape square = provider2.getShape();
        square.draw();
        Provider provider3 = new TriangleFactory();
        Shape triangle = provider3.getShape();
        triangle.draw();
    }
}
