package others.design_patterns.structural.s3_filter.impl;


import others.design_patterns.structural.s3_filter.Criteria;
import others.design_patterns.structural.s3_filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
