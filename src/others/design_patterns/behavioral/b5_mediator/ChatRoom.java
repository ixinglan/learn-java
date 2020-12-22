package others.design_patterns.behavioral.b5_mediator;

import java.util.Date;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
