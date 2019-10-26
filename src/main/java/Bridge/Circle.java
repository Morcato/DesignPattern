package Bridge;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/28 18:56
 * @Description:
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);

    }

    @Override
    void showMyself() {
        System.out.println("circle");
    }
}
