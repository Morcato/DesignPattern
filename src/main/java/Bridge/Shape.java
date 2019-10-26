package Bridge;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/28 18:53
 * @Description:
 */
public abstract class Shape {

    private Color color;

    public Shape(Color color){
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void drawOneShape(){
        color.draw();
        this.showMyself();
    }

    abstract  void showMyself();

}
