package AbstractFactory;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 10:33
 * @Description:
 */
public interface LabourFactory {

    Shoes produceShoes();

    Cloth produceCloth();
}
