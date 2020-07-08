package enum_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * @description:
 * @author:zhaojq
 */
public class AnnotationTest {

    //反射获取
    @Test
    public void t1() {
        Class<Person> clazz = Person.class;
        Annotation[] annotations = clazz.getAnnotations();
        Arrays.asList(annotations).forEach(System.out::println);

        //获取值
        MyAnnotation[] annotationsByType = clazz.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation m : annotationsByType) {
            System.out.println(m.value());
        }
    }
}
