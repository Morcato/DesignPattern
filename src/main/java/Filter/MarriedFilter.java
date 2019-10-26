package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/29 10:55
 * @Description:
 */
public class MarriedFilter implements Filter {

    public List<Person> filter(List<Person> persons) {
        List<Person> tmp = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMarital().equalsIgnoreCase("married")) {
                tmp.add(person);
            }
        }
        return tmp;
    }
}
