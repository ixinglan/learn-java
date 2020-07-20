package jdk_version.java11;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:zhaojq
 */
public class ZGCTest {
    public static void main(String[] args) {
        List<Garbage2> list = new ArrayList<>();
        int count = 0;
        boolean flag = true;
        while (flag){
            list.add(new Garbage2());
            if(count++==200){
                list.clear();
            }
        }
    }

}
class Garbage2{
    double d1 = 1;
    double d2 = 2;

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " is collection");
    }
}
