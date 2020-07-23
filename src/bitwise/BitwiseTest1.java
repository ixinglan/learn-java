package bitwise;

import org.junit.Test;

/**
 * 位运算
 * 原码: 正数首位符号位为0, 负数为1
 * 反码: 正数反码=原码, 负数反码=原码取反
 * 补码: 正数补码=原码, 负数补码=反码+1
 *
 *
 * &:与 都为1,结果为1
 * |:或 都为0,结果为0
 * ^:异或 相同为0,相异为1
 * ~:取反
 * <<:左移 全部左移若干位,高位丢弃,低位补0
 * 右移:
 * >>: 算术右移, 即带符号右移,用最高位填充移位后左侧空位
 * >>>: 逻辑右移, 即无符号右移,用0填充左侧空位
 */
public class BitwiseTest1 {
    @Test
    public void t1() {
        int a = -15;// 原码 1000 1111; 反码 1111 0000; 补码 1111 0001
        int b = 15;//原码 1000 1111;

        System.out.println(a >> 2);//1111 0001补 --> 1111 1100补 --> 1111 1011反 --> 1000 0100 (-4)
        System.out.println(b >> 2);
    }

    //末是0为偶数,为1是奇数
    @Test
    public void t2() {
        //1: 0000 0001
        for (int i = 0; i < 100; i++) {
            if ((i & 1) == 0) { // 偶数
                System.out.println(i);
            }
        }

        for (int i = 0; i < 100; i++) {
            if ((i & 1) == 1) { // 奇数
                System.out.println(i);
            }
        }
    }

    //交换两数
    @Test
    public void t3() {
        //a 0000 0101
        //b 0000 1001
        int a = 5, b = 9;
        a ^= b;
        System.out.println(a);
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);

        /*
        一种思路:
            第一步 a ^= b 即 a = (a ^ b)；
            第二步 b ^= a 即 b= b ^ ( a ^ b)，由于异或运算满足交换律，b ^ ( a ^ b) = b ^ b ^ a。由于一个数和自己异或的结果为 0 并且任何数与 0 异或都会不变的，所以此时 b 被赋上了 a 的值；
            第三步 a ^= b 就是 a = a ^ b，由于前面二步可知 a = ( a ^ b)，b=a，所以 a = a ^ b 即 a = ( a ^ b ) ^ a。故 a 会被赋上 b 的值
         */
        /*
        另一种思路: 异或是不同为真(1), 相同为假(0),则
            a^b 得到的值,0000 0101 ^ 0000 1001 --> 0000 1100
            则代表a和b末2位相同, 其余两位不同, 与a,b与a^b 异或,就可得到对方的值,实现了交换
         */
    }

    //变换符号
    @Test
    public void t4() {
        //取反 +1
        int a = 9;
        System.out.println(~a + 1);

        int b = -9;
        System.out.println(~b + 1);
        System.out.println(~(b - 1));
    }

    //求绝对值
    @Test
    public void t5() {
        /*
        位操作也可以用来求绝对值，对于负数可以通过上面变换符号方式对其取反后加1来得到正数。
        因此先移位来取符号位，int i = a >> 31; 要注意如果 a 为正数，i 等于 0，为负数，i 等于 -1
         */
        int a = 11, b = -11;
        int i = a >> 31;
        int j = b >> 31;

        System.out.println(i == 0 ? a : (~a + 1));
        System.out.println(j == 0 ? b : (~b + 1));
    }
}
