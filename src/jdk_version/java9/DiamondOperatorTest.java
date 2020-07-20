package jdk_version.java9;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DiamondOperatorTest {

    @Test
    public void testDiamondOperator() {
        diamondOperator();
    }

    public void diamondOperator() {
        //创建一个继承于HashSet的匿名子类的对象
//        Set<String> set = new HashSet<String>(){};//java8需写成这样, 否则编译不通过
        Set<String> set = new HashSet<>() {
        };//编译通过
        set.add("MM");
        set.add("JJ");
        set.add("GG");
        set.add("DD");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
