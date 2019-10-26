package SimpleFactory.impl;

import SimpleFactory.Shape;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/30 16:36
 * @Description:
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("Circle drawing...");
    }
}
