package FactoryMethod.factory;

import FactoryMethod.Provider;
import FactoryMethod.Shape;
import FactoryMethod.impl.Circle;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 09:47
 * @Description:
 */
public class CircleFactory implements Provider {

    public Shape getShape() {
        return new Circle();
    }
}
