package others.design_patterns.structural.s8_proxy;


import others.design_patterns.structural.s8_proxy.impl.ProxyImage;

/**
 * @description: 代理模式
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
