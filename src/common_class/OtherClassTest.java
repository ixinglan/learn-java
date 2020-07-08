package common_class;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @description:
 * @author:zhaojq
 */
public class OtherClassTest {
    @Test
    public void t2() {
        BigInteger bi = new BigInteger("1111111222222222222333333333333344444444");
        System.out.println(bi);

        BigDecimal bd1 = new BigDecimal("12345.351");
        BigDecimal bd2 = new BigDecimal("11");
//        System.out.println(bd1.divide(bd2)); //除不尽时需指定精度, 否则会报错
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_UP));
        System.out.println(bd1.divide(bd2, 15, RoundingMode.HALF_UP));
    }

    @Test
    public void t1() {
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println(javaHome);

        String osVersion = System.getProperty("os.version");
        System.out.println(osVersion);

        String osName = System.getProperty("os.name");
        System.out.println(osName);

        String username = System.getProperty("user.name");
        System.out.println(username);

        String userhome = System.getProperty("user.home");
        System.out.println(userhome);

        String userdir = System.getProperty("user.dir");
        System.out.println(userdir);
    }
}
