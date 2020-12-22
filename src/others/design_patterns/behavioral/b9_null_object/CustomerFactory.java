package others.design_patterns.behavioral.b9_null_object;


import others.design_patterns.behavioral.b9_null_object.impl.NullCustomer;
import others.design_patterns.behavioral.b9_null_object.impl.RealCustomer;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
