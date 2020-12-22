package others.design_patterns.behavioral.b9_null_object.impl;


import others.design_patterns.behavioral.b9_null_object.AbstractCustomer;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
