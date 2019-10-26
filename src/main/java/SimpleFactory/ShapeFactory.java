package SimpleFactory;

import SimpleFactory.impl.Circle;
import SimpleFactory.impl.Sqaure;
import SimpleFactory.impl.Triangle;

/**
 * @Auther: shenzixing
 * @Date: 2018/7/30 16:43
 * @Description:
 */
public class ShapeFactory {

    public Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        }
        if (shapeName.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new Sqaure();
        } else if (shapeName.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        return null;
    }

}
