package Decorator;

/**
 * 铠甲
 *
 * @author shenzixing
 * @date 2019/10/26
 **/
public class Armor extends AbstractEquipmentDecorator {

    private AbstractCharacter character;

    public Armor(AbstractCharacter character) {
        this.character = character;
    }

    @Override
    public Integer getHp() {
        //血量+20
        return character.getHp() + 20;
    }

    @Override
    public Integer getAtk() {
        return character.getAtk();
    }

    @Override
    public Integer getDef() {
        //防御力+50
        return character.getDef() + 50;
    }

    @Override
    public Integer getSpd() {
        //移速-10
        return character.getSpd() - 10;
    }

    @Override
    public String describe() {

        //铠甲降低10点移动速度
        return character.describe() + " 装备了一具铠甲";

    }
}
