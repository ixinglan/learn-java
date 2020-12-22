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
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
