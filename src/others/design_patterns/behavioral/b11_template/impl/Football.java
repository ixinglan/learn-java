package others.design_patterns.behavioral.b11_template.impl;


import others.design_patterns.behavioral.b11_template.Game;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
