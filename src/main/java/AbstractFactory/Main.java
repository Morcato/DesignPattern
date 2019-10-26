package AbstractFactory;

import AbstractFactory.factory.AddidasFactory;
import AbstractFactory.factory.NikeFactory;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 10:38
 * @Description: 创建型模式---抽象工厂模式
 * 工厂模式中一个工厂只能生产一种产品，而抽象工厂可以生产多个。
 */
public class Main {

    public static void main(String[] args) {
        LabourFactory labourFactory1 = new AddidasFactory();
        Cloth addidasCloth = labourFactory1.produceCloth();
        Shoes addidasShoes = labourFactory1.produceShoes();
        addidasCloth.wear();
        addidasShoes.wear();

        LabourFactory labourFactory2 = new NikeFactory();
        Cloth nikeCloth = labourFactory1.produceCloth();
        Shoes nikeShoes = labourFactory2.produceShoes();
        nikeCloth.wear();
        nikeShoes.wear();

    }
}
