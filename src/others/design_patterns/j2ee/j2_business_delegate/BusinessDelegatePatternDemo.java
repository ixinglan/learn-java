package others.design_patterns.j2ee.j2_business_delegate;

/**
 * @description: 业务代表模式
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
