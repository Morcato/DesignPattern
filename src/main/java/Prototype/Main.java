package Prototype;


/**
 * @Auther: shenzixing
 * @Date: 2018/8/8 09:35
 * @Description: 创建型模式---原型模式
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //浅拷贝
        System.out.println("--------------浅拷贝----------------");
        PrototypeA prototypeA = new PrototypeA();
        prototypeA.setAge(11);
        prototypeA.setName("aabbcc");
        Child child = new Child();
        child.setName("aaa");
        prototypeA.setChild(child);
        PrototypeA clonePrototypeA = (PrototypeA) prototypeA.clone();
        clonePrototypeA.setAge(30);
        clonePrototypeA.getChild().setName("bbb");
        System.out.println("prototypeA:" + prototypeA);
        System.out.println("clonePrototypeA:" + clonePrototypeA);
        /***************************************************************/
        //深拷贝
        System.out.println("--------------深拷贝----------------");
        prototypeA = new PrototypeA();
        prototypeA.setAge(11);
        prototypeA.setName("aabbcc");
        child = new Child();
        child.setName("aaa");
        prototypeA.setChild(child);
        clonePrototypeA = (PrototypeA) prototypeA.deepClone();
        clonePrototypeA.setAge(30);
        clonePrototypeA.getChild().setName("bbb");
        System.out.println("prototypeA:" + prototypeA);
        System.out.println("clonePrototypeA:" + clonePrototypeA);
    }
}
