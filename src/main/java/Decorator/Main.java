package Decorator;

/**
 * @author shenzixing
 * @date 2019/10/26
 **/
public class Main {

    public static void main(String[] args) {

        //创建一个持剑带铠甲的刺客
        AbstractCharacter assassinWithSwordAndArmor = new Assassin();
        assassinWithSwordAndArmor = new Sword(assassinWithSwordAndArmor);
        assassinWithSwordAndArmor = new Armor(assassinWithSwordAndArmor);

        System.out.println(assassinWithSwordAndArmor.describe());
        System.out.println(" 攻击力:" + assassinWithSwordAndArmor.getAtk());
        System.out.println(" 防御力:" + assassinWithSwordAndArmor.getDef());
        System.out.println(" 生命值:" + assassinWithSwordAndArmor.getHp());
        System.out.println(" 速度:" + assassinWithSwordAndArmor.getSpd());
        System.out.println("===================================");

        //创建一个双剑骑士
        AbstractCharacter doubleSwordKnight = new Knight();
        doubleSwordKnight = new Sword(doubleSwordKnight);
        doubleSwordKnight = new Sword(doubleSwordKnight);

        System.out.println(doubleSwordKnight.describe());
        System.out.println(" 攻击力:" + doubleSwordKnight.getAtk());
        System.out.println(" 防御力:" + doubleSwordKnight.getDef());
        System.out.println(" 生命值:" + doubleSwordKnight.getHp());
        System.out.println(" 速度:" + doubleSwordKnight.getSpd());
        System.out.println("==================================");
    }

}
