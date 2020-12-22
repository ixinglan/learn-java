package others.design_patterns.j2ee.j6_interception_filter.impl;


import others.design_patterns.j2ee.j6_interception_filter.Filter;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
