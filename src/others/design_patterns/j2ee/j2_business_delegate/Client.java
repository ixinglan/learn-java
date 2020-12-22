package others.design_patterns.j2ee.j2_business_delegate;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
