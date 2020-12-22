package others.design_patterns.j2ee.j6_interception_filter;

/**
 * @description: 请求处理程序
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
