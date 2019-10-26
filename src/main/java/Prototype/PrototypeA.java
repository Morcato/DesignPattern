package Prototype;

import java.io.*;
import java.util.List;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/8 09:29
 * @Description: 原型
 */
public class PrototypeA implements Cloneable, Serializable {

    private String name;

    private int age;

    public Child child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "PrototypeA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", child=" + child +
                '}';
    }

    /**
     * 实现浅拷贝(即基本类型可以复制一份新的,其他引用类型仍然指向相同地址)
     * 使用一个已知实例对新创建实例的成员变量逐个赋值，这个方式被称为浅拷贝。
     *
     * @author: shenzixing
     * @date: 2018/8/8
     **/
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 实现深拷贝(即完全复制出一份新的对象)
     * 当一个类的拷贝构造方法，不仅要复制对象的所有非引用成员变量值，还要为引用类型的成员变量创建新的实例，并且初始化为形式参数实例值。这个方式称为深拷贝
     *
     * @author: shenzixing
     * @date: 2018/8/8
     **/
    public Object deepClone() throws Exception {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


}
