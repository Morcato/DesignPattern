package FactoryMethod.factory;

import FactoryMethod.Provider;
import FactoryMethod.Shape;
import FactoryMethod.impl.Triangle;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 09:52
 * @Description:
 */
public class TriangleFactory implements Provider {
    public Shape getShape() {
        return new Triangle();
    }
}
