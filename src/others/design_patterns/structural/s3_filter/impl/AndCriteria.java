package others.design_patterns.structural.s3_filter.impl;


import others.design_patterns.structural.s3_filter.Criteria;
import others.design_patterns.structural.s3_filter.Person;

import java.util.List;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
