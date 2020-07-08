package enum_annotation;

import org.junit.Test;

import java.util.Arrays;

/**
 * @description:
 * @author:zhaojq
 */
public class EnumTest {
    @Test
    public void t3() {
        SeasonEnum spring = SeasonEnum.valueOf("SPRING");
        System.out.println(spring);
    }

    @Test
    public void t2() {
        SeasonEnum[] values = SeasonEnum.values();
        Arrays.asList(values).forEach(System.out::println);

        System.out.println("------------------------------------");
        //线程状态
        Thread.State[] values1 = Thread.State.values();
        Arrays.asList(values1).forEach(System.out::println);
    }

    @Test
    public void t1() {
        SeasonEnum s1 = SeasonEnum.SPRING;
        System.out.println(s1.getSeasonName());
        System.out.println(s1.getSeasonDesc());
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(SeasonEnum.class.getSuperclass());
    }
}
