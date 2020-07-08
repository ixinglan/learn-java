package jdk_version.java8.jdk8_02.annotation;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @description: 测试重复注解
 */
public class AnnotatonTest {

    @Test
    public void test() throws NoSuchMethodException {
        Class<AnnotatonTest> clazz = AnnotatonTest.class;
        Method show = clazz.getMethod("show");

        MyAnnotation[] annotationsByType = show.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation m : annotationsByType) {
            System.out.println(m.value());
        }
    }

    @MyAnnotation("thank")
    @MyAnnotation("you")
    public void show() {
    }
}
