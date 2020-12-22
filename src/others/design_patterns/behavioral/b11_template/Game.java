package others.design_patterns.behavioral.b11_template;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public abstract class Game {
    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
