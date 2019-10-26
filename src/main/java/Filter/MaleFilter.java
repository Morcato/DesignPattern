package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/29 10:50
 * @Description:
 */
public class MaleFilter implements Filter {

    public List<Person> filter(List<Person> persons) {
        List<Person> tmp = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male")) {
                tmp.add(person);
            }
        }
        return tmp;
    }
}
