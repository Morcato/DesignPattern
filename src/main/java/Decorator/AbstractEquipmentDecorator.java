package Decorator;

/**
 * @author shenzixing
 * @date 2019/10/26
 **/
public abstract class AbstractEquipmentDecorator extends AbstractCharacter {

    /**
     * 该方法必须重写
     */
    @Override
    public abstract Integer getHp();

    /**
     * 该方法必须重写
     */
    @Override
    public abstract Integer getAtk();

    /**
     * 该方法必须重写
     */
    @Override
    public abstract Integer getDef();

    /**
     * 该方法必须重写
     */
    @Override
    public abstract Integer getSpd();

    /**
     * 该方法必须重写
     */
    @Override
    public abstract String describe();

}
