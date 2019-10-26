package Filter;

import java.util.List;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/29 11:00
 * @Description:
 */
public class OrFilter implements Filter {

    Filter filter;
    Filter otherFilter;

    public OrFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    public List<Person> filter(List<Person> persons) {
        List<Person> tmp = filter.filter(persons);
        List<Person> tmp2 = otherFilter.filter(persons);
        for (Person person : tmp2) {
            if (!tmp.contains(person)) {
                tmp.add(person);
            }
        }
        return tmp;

    }
}
