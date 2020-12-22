package others.design_patterns.structural.s1_adapter;


import others.design_patterns.structural.s1_adapter.impl.AudioPlayer;

/**
 * @description: 适配器模式
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
