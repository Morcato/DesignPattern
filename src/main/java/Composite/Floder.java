package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: shenzixing
 * @Date: 2018/9/8 17:18
 * @Description:
 */
public class Floder implements AbstractFile {

    private String name ;

    public Floder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<AbstractFile> fileList = new ArrayList<AbstractFile>();

    public void add(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    public void delete(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    public void killVirus() {
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
