package AbstractFactory.factory;

import AbstractFactory.Cloth;
import AbstractFactory.LabourFactory;
import AbstractFactory.Shoes;
import AbstractFactory.impl.AddidasCloth;
import AbstractFactory.impl.AddidasShoes;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 10:37
 * @Description:
 */
public class AddidasFactory implements LabourFactory {
    public Shoes produceShoes() {
        return new AddidasShoes();
    }

    public Cloth produceCloth() {
        return new AddidasCloth();
    }
}
