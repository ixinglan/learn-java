package others.design_patterns.structural.s8_proxy.impl;


import others.design_patterns.structural.s8_proxy.Image;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
