package Filter;

import java.util.List;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/29 10:56
 * @Description:
 */
public class AndFilter implements Filter {

    Filter filter;
    Filter otherFilter;

    public AndFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    public List<Person> filter(List<Person> persons) {
        List<Person> tmp = filter.filter(persons);
        tmp = otherFilter.filter(tmp);
        return tmp;
    }
}
