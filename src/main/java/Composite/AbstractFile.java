package Composite;

/**
 * @Auther: shenzixing
 * @Date: 2018/9/8 17:13
 * @Description:
 */
public interface AbstractFile {

    //创建新文件/文件夹
    void add(AbstractFile abstractFile);

    //删除文件/文件夹
    void delete(AbstractFile abstractFile);

    //获取文件/文件夹
    AbstractFile getChild(int i);

    //杀毒
    void killVirus();


}
