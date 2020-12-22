package others.design_patterns.j2ee.j7_service_locator.impl;


import others.design_patterns.j2ee.j7_service_locator.Service;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class Service2 implements Service {
    public void execute() {
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
