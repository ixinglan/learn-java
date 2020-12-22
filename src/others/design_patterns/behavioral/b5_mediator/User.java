package others.design_patterns.behavioral.b5_mediator;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
