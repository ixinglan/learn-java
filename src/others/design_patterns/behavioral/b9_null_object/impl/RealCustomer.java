package others.design_patterns.behavioral.b9_null_object.impl;


import others.design_patterns.behavioral.b9_null_object.AbstractCustomer;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
