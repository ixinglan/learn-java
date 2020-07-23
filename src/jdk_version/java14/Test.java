package jdk_version.java14;

import static java.util.Calendar.*;

/**
 * @description:
 * @author:zhaojq
 */
public class Test {
    //2 Record 记录类型
    public record User(int x, int y) {
    }

    public static void main(String[] args) {
        //2 Record 记录类型
        User user = new User(1, 2);
        System.out.println(user.x);
        System.out.println(user.y);

        //1 instanceof 新特性
        Object obj = "bitwise";
        if (obj instanceof String s && s.length() == 4) {
            System.out.println(s);
            System.out.println(s.length());
        } else {
//            System.out.println(s);
        }

        if (!(obj instanceof String s)) {
//            System.out.println(s);
        } else {
            System.out.println(s);
        }

        //3 switch 新特性
        formatWeek(0);
        formatWeek(1);
        formatWeek(2);
        formatWeek(3);
        formatWeek(4);
        formatWeek(5);
        formatWeek(6);

        System.out.println(formatWeek2(5));
        System.out.println(formatWeek2(6));

        //4 文本块
        String html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;
        System.out.println(html);
    }

    //3 switch 新特性
    public static void formatWeek(int day) {
        switch (day) {
            case MONDAY -> System.out.println("MONDAY");
            case TUESDAY -> System.out.println("TUESDAY");
            case WEDNESDAY -> System.out.println("WEDNESDAY");
            case THURSDAY -> System.out.println("THURSDAY");
            case FRIDAY -> System.out.println("FRIDAY");
            case SATURDAY -> System.out.println("SATURDAY");
            case SUNDAY -> System.out.println("SUNDAY");
        }
    }

    //3 switch 新特性
    public static String formatWeek2(int day) {
        String str = switch (day) {
            case MONDAY -> "MONDAY";
            case TUESDAY -> "TUESDAY";
            case WEDNESDAY -> "WEDNESDAY";
            case THURSDAY -> "THURSDAY";
            case FRIDAY -> "FRIDAY";
            case SATURDAY -> "SATURDAY";
            case SUNDAY -> "SUNDAY";
            default -> "NONE";
        };
        return str;
    }
}
