package Composite;

/**
 * @Auther: shenzixing
 * @Date: 2018/9/8 17:21
 * @Description: 结构模式---组合模式
 * 组合模式非常适用于类似目录的结构,他将叶子节点与树枝节点抽象成或者说是组合成了一种类(本例中的AbstractFile)
 * 接着只需要对这个新组成的类进行操作即可完成复杂的操作
 *
 */
public class Main {

    public static void main(String[] args) {
        AbstractFile imageFile1 = new ImageFile("图片1");
        AbstractFile imageFile2 = new ImageFile("图片2");
        AbstractFile imageFile3 = new ImageFile("图片3");
        AbstractFile imageFile4 = new ImageFile("图片4");

        AbstractFile textFile1 = new TextFile("文本1");
        AbstractFile textFile2 = new TextFile("文本2");
        AbstractFile textFile3 = new TextFile("文本3");
        AbstractFile textFile4 = new TextFile("文本4");

        AbstractFile Floder1 = new Floder("文件夹1");
        AbstractFile Floder2 = new Floder("文件夹2");
        AbstractFile Floder3 = new Floder("文件夹3");

        Floder1.add(imageFile1);
        Floder1.add(imageFile2);
        Floder1.add(textFile1);
        Floder1.add(Floder2);
        Floder1.add(Floder3);

        Floder2.add(imageFile3);
        Floder2.add(textFile2);

        Floder3.add(imageFile4);
        Floder3.add(textFile3);
        Floder3.add(textFile4);

        System.out.println("========文件夹1开始杀毒了=========");
        Floder1.killVirus();
        System.out.println("========文件夹1杀毒结束=========");

        System.out.println("========文件夹2开始杀毒了=========");
        Floder2.killVirus();
        System.out.println("========文件夹2杀毒结束=========");

        System.out.println("========文件夹3开始杀毒了=========");
        Floder3.killVirus();
        System.out.println("========文件夹3杀毒结束=========");
    }

}
