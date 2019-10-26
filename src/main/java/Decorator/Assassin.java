package Decorator;

/**
 * 刺客
 *
 * @author shenzixing
 * @date 2019/10/26
 **/
public class Assassin extends AbstractCharacter {

    public Assassin() {

        this.setHp(50);
        this.setAtk(80);
        this.setDef(30);
        this.setSpd(60);
        this.setName("刺客");
    }

}
