package others.design_patterns.structural.s1_adapter.impl;


import others.design_patterns.structural.s1_adapter.AdvancedMediaPlayer;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
