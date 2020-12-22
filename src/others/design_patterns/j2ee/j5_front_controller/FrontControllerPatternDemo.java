package others.design_patterns.j2ee.j5_front_controller;

/**
 * @description: 前端控制器模式
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
