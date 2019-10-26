package Decorator;

/**
 * 大剑
 *
 * @author shenzixing
 * @date 2019/10/26
 **/
public class Sword extends AbstractEquipmentDecorator {

    private AbstractCharacter character;

    public Sword(AbstractCharacter character) {
        this.character = character;
    }

    @Override
    public Integer getHp() {
        return character.getHp();
    }

    @Override
    public Integer getAtk() {
        //攻击力+30
        return character.getAtk() + 30;
    }

    @Override
    public Integer getDef() {
        //防御力+5
        return character.getDef() + 5;
    }

    @Override
    public Integer getSpd() {
        return character.getSpd();
    }

    @Override
    public String describe() {
        return character.describe() + " 装备了一把大剑";
    }
}
