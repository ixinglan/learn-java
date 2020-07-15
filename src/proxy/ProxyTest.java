package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class ProxyTest {
    public static void main(String[] args) {
        Male male = new Male();
        //代理类对象
        People proxyInstance = (People) ProxyFactory.getProxyInstance(male);

        //当通过代理类对象调用方法时,会自动调用被代理类中同名的方法
        String type = proxyInstance.getType();
        System.out.println(type);
        proxyInstance.like("女人");
    }

}

class Util {
    public static void method1() {
        System.out.println("-----------通用方法1------------");
    }

    public static void method2() {
        System.out.println("-----------通用方法2------------");
    }
}

class ProxyFactory {
    //通过调用此方法,返回一个代理类对象
    public static Object getProxyInstance(Object obj) {//obj为被代理类对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvocationHandler);
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object obj;//需要使用被代理类的对象赋值

    public void bind(Object obj) {
        this.obj = obj;
    }

    //当我们通过代理类对象调用方法a时, 就会自动调用此方法: invoke()
    //将被代理类要执行的方法a的功能就声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Util.method1();
        //method为代理类对象调用的方法,此方法也就作为了被代理类对象要调用的方法
        //obj:被代理类对象
        Object invoke = method.invoke(obj, args);

        Util.method2();
        //上述方法的返回值作为invoke()的返回值
        return invoke;
    }
}

//被代理类
class Male implements People {
    @Override
    public String getType() {
        return "男性";
    }

    @Override
    public void like(String thing) {
        System.out.println("男性喜欢" + thing);
    }
}

//被代理类
class Female implements People {
    @Override
    public String getType() {
        return "女性";
    }

    @Override
    public void like(String thing) {
        System.out.println("女性喜欢" + thing);
    }
}

interface People {
    String getType();

    void like(String thing);
}
