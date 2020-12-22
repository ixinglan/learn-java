package others.design_patterns.j2ee.j2_business_delegate.impl;


import others.design_patterns.j2ee.j2_business_delegate.BusinessService;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
