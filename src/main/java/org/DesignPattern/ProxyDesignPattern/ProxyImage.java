package org.DesignPattern.ProxyDesignPattern;

public class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    @Override
    public void display() {
        System.out.println("File name is : " + fileName);
    }
}
