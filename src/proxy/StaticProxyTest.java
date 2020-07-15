package proxy;

/**
 * 静态代理
 * 特点: 代理类和被代理类在编译期间就确定
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类对象
        AppleFactory apple = new AppleFactory();
        //创建代理类对象
        ProxyFoodFactory proxyFoodFactory = new ProxyFoodFactory(apple);

        proxyFoodFactory.getFood();
    }
}

//代理类
class ProxyFoodFactory implements FoodFactory {
    private FoodFactory factory;//用被代理类对象进行实例化

    public ProxyFoodFactory(FoodFactory factory) {
        this.factory = factory;
    }

    @Override
    public void getFood() {
        System.out.println("代理工厂初始化");
        factory.getFood();
        System.out.println("代理工厂结束");
    }
}

//被代理类
class AppleFactory implements FoodFactory {

    @Override
    public void getFood() {
        System.out.println("买一箱苹果");
    }
}

interface FoodFactory {
    void getFood();
}