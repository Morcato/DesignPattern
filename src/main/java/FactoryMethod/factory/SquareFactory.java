package FactoryMethod.factory;

import FactoryMethod.Provider;
import FactoryMethod.Shape;
import FactoryMethod.impl.Sqaure;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 09:51
 * @Description:
 */
public class SquareFactory implements Provider {
    public Shape getShape() {
        return new Sqaure();
    }
}
