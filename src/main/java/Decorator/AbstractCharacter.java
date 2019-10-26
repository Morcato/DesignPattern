package Decorator;

import lombok.Data;

/**
 * 游戏角色
 *
 * @author shenzixing
 * @date 2019/10/26
 **/

@Data
public abstract class AbstractCharacter {

    /**
     * 生命值
     */
    private Integer hp;

    /**
     * 攻击力
     */
    private Integer atk;

    /**
     * 防御力
     */
    private Integer def;

    /**
     * 速度
     */
    private Integer spd;

    /**
     * 职业名称
     */
    private String name;


    /**
     * 人物描述
     */
    public String describe() {

        return name;
    }
}
