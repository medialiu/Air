package com.media.demo.san;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Test {
    String name;
    String id;
    int add;
    //双缓冲技术
    public void paint(Graphics g){
        BufferedImage bufferImage=new BufferedImage(300,400,BufferedImage.TYPE_INT_ARGB);
        Graphics g1=bufferImage.createGraphics();
        g.drawImage(bufferImage,300,400,null);
    }


    //current
//    System.exit(0);
    public static void main(String[] args) {

        System.out.println(45);
    }
}
