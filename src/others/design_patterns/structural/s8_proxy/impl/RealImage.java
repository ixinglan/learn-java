package others.design_patterns.structural.s8_proxy.impl;


import others.design_patterns.structural.s8_proxy.Image;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
