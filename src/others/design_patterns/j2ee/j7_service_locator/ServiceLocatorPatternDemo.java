package others.design_patterns.j2ee.j7_service_locator;

/**
 * @description: 服务定位器模式
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
