package Prototype;

import java.io.Serializable;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/8 09:53
 * @Description:
 */
public class Child implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                '}';
    }
}
