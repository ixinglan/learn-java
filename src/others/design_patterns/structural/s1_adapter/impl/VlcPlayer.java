package others.design_patterns.structural.s1_adapter.impl;


import others.design_patterns.structural.s1_adapter.AdvancedMediaPlayer;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
