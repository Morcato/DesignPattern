package Composite;

/**
 * @Auther: shenzixing
 * @Date: 2018/9/8 17:10
 * @Description:
 */
public class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        System.out.println("不是文件夹,操作错误...");
    }

    public void delete(AbstractFile abstractFile) {
        System.out.println("不是文件夹,操作错误...");
    }

    public AbstractFile getChild(int i) {
        System.out.println("不是文件夹,操作错误...");
        return null;
    }

    public void killVirus() {
        System.out.println("对图片文件" + name + "进行杀毒中...");
    }
}
