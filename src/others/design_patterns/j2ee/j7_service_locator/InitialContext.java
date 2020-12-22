package others.design_patterns.j2ee.j7_service_locator;


import others.design_patterns.j2ee.j7_service_locator.impl.Service1;
import others.design_patterns.j2ee.j7_service_locator.impl.Service2;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class InitialContext {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
