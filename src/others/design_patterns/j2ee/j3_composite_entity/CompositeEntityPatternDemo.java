package others.design_patterns.j2ee.j3_composite_entity;

/**
 * @description: 组合实体模式
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
