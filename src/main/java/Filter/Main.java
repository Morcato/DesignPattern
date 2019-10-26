package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: shenzixing
 * @Date: 2018/8/29 11:04
 * @Description: 结构模式---过滤器模式(标准模式)
 * 过滤器模式（Filter）也叫标准模式（Criteria）
 * 这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
 */
public class Main {


    public static void main(String[] args) {
        Filter maleFilter = new MaleFilter();
        Filter femaleFilter = new FemaleFilter();
        Filter singleFilter = new SingleFilter();
        Filter marriedFilter = new MarriedFilter();
        List<Person> result;

        Person person1 = new Person("person1", "male", "married");
        Person person2 = new Person("person2", "female", "single");
        Person person3 = new Person("person3", "female", "married");
        Person person4 = new Person("person4", "male", "single");
        Person person5 = new Person("person5", "female", "married");
        Person person6 = new Person("person6", "female", "single");
        Person person7 = new Person("person7", "male", "married");
        Person person8 = new Person("person8", "female", "single");
        Person person9 = new Person("person9", "female", "married");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);

        System.out.println("=========所有男性===========");
        result = maleFilter.filter(personList);
        for (Person person : result) {
            System.out.println(person);
        }
        System.out.println("=========所有单身===========");
        result = singleFilter.filter(personList);
        for (Person person : result) {
            System.out.println(person);
        }
        System.out.println("=========所有已婚女性===========");
        Filter andFilter = new AndFilter(femaleFilter, marriedFilter);
        result = andFilter.filter(personList);
        for (Person person : result) {
            System.out.println(person);
        }
        System.out.println("=========所有单身或者所有男性===========");
        Filter orFilter = new OrFilter(maleFilter, singleFilter);
        result = orFilter.filter(personList);
        for (Person person : result) {
            System.out.println(person);
        }

    }
}
