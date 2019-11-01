package Decorator;

/**
 * 大剑
 *
 * @author shenzixing
 * @date 2019/10/26
 **/
public class Sword extends AbstractEquipmentDecorator {

    /**
     * 通过组合的方式持有了游戏角色基类
     */
    private AbstractCharacter character;

    public Sword(AbstractCharacter character) {
        this.character = character;
    }

    @Override
    public Integer getHp() {
        return character.getHp();
    }

    /**
     * 在原有角色基础上攻击力+30
     */
    @Override
    public Integer getAtk() {
        return character.getAtk() + 30;
    }

    /**
     * 在原有角色基础上防御力+5
     */
    @Override
    public Integer getDef() {
        return character.getDef() + 5;
    }

    @Override
    public Integer getSpd() {
        return character.getSpd();
    }


    /**
     * 将原有角色 携带的所有都打印出来
     */
    @Override
    public String describe() {
        return character.describe() + " 装备了一把大剑";
    }
}
