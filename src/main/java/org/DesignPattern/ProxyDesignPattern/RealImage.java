package org.DesignPattern.ProxyDesignPattern;

public class RealImage implements Image{

    private final String fileName;

    public RealImage(String fileName){
        this.fileName=fileName;
        loading();
    }
    @Override
    public void display() {
        System.out.println("File name is : "+fileName);
    }

    public void loading(){
        System.out.println("Loading from Disk");
    }
}
