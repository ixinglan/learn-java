package others.design_patterns.j2ee.j6_interception_filter;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
