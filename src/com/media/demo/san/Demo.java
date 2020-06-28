package com.media.demo.san;

/**
 * 优先级：静态代码块> 构造代码块>构造方法
 * 静态只执行一次
 * 构造代码块new一次执行一次
 * 构造方法new一次执行一次
 */
public class Demo {
//    String name;
     public static Demo demo1=new Demo();//首先执行
    {
        System.out.println("我是构造代码块");
      //  System.out.println("blockA");
    }
    public Demo(){
        System.out.println("我是构造方法");
    }
    static{
        System.out.println("我是静态代码块");
//    System.out.println("blockB");
    }

    public static void main(String[] args) {
        Demo s1=new Demo();
    }
}
