package AbstractFactory.factory;

import AbstractFactory.Cloth;
import AbstractFactory.LabourFactory;
import AbstractFactory.Shoes;
import AbstractFactory.impl.NikeCloth;
import AbstractFactory.impl.NikeShoes;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 10:32
 * @Description:
 */
public class NikeFactory implements LabourFactory {

    public Shoes produceShoes() {
        return new NikeShoes();
    }

    public Cloth produceCloth() {
        return new NikeCloth();
    }
}
