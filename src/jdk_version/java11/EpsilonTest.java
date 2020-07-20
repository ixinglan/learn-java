package jdk_version.java11;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:zhaojq
 */
public class EpsilonTest {
    public static void main(String[] args) {
        boolean flag = true;
        List<Garbage> list = new ArrayList<>();
        long count = 0;
        while (flag) {
            list.add(new Garbage());
            if (list.size() == 1000000 && count == 0) {
                list.clear();
                count++;
            }
        }
        System.out.println("程序结束");
    }
}

class Garbage {
    int n = (int) (Math.random() * 100);

    //gc在清除本对象时会调用一次
    @Override
    public void finalize() {
        System.out.println(this + " : " + n + " is dying");
    }
}

