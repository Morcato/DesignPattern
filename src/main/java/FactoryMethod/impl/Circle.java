package FactoryMethod.impl;

import FactoryMethod.Shape;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/31 9:28
 * @Description:
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("Circle drawing...");
    }
}
