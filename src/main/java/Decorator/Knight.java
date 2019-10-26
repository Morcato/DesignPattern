package Decorator;

/**
 * 骑士角色
 *
 * @author shenzixing
 * @date 2019/10/26
 **/
public class Knight extends AbstractCharacter {

    public Knight() {
        this.setHp(80);
        this.setAtk(45);
        this.setDef(70);
        this.setSpd(30);
        this.setName("骑士");
    }

}
