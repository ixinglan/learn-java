package others.design_patterns.j2ee.j6_interception_filter;


import others.design_patterns.j2ee.j6_interception_filter.impl.AuthenticationFilter;
import others.design_patterns.j2ee.j6_interception_filter.impl.DebugFilter;

/**
 * @description: 拦截过滤器模式
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
