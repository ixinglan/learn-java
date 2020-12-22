package others.design_patterns.j2ee.j2_business_delegate;

import others.design_patterns.j2ee.j2_business_delegate.impl.EJBService;
import others.design_patterns.j2ee.j2_business_delegate.impl.JMSService;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
