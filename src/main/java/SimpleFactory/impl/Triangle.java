package SimpleFactory.impl;

import SimpleFactory.Shape;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/30 16:37
 * @Description:
 */
public class Triangle implements Shape {
    public void draw() {
        System.out.println("Triangle drawing...");
    }
}
