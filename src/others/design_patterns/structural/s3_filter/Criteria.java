package others.design_patterns.structural.s3_filter;

import java.util.List;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
