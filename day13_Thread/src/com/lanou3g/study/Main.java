package com.lanou3g.study;

import java.util.Date;

public class Main {

    private static Thread thread;

    public static void main(String[] args) throws 心里没什么数异常 {
        /*
            线程：Thread
            什么是线程？
            再讲线程之前，来说一下什么是进程？
            进程就是一个程序
            线程就是程序中的执行单元
            进程中可以执行多个线程
            正常情况下，每个线程都有自己独立的执行流程
            互不干扰
            如果人为写的话，可以让两个线程产生交集
         */
//        thread = new HelloThread();
        //开启一个线程
        //创建一个Thread的子类
        //创建一个runnable接口的实现类
//        thead = new Thread(new HelloRunnable());
        //什么叫内部类？
        //定义在一个类的内部的类，就叫内部类
        //没有名字的对象叫匿名对象
        //呢么没有名字的类就叫匿名类
        //这个类又在另一个类的内部，就叫匿名内部类
//        thead = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5000; i++) {
//                    System.out.println("我是匿名内部类中的run"+i);
//                }
//            }
//        });
//        thead = new Thread(){
//            @Override
//            public void run() {
//                super.run();
//
//            }
//        };
        //start方法，才是真正开启一个线程
        /*
            thread.run()，只是调用了某个对象的方法
            并没有开启线程
            自然也不会出现相互交替打印的情况
         */

//        thread.run();
//        for (int i = 0; i < 10000; i++) {
//            //Thread的静态方法currentThread
//            //可以帮我们获得当前正在执行的线程对象
//            //调用这个线程的getName（）方法获得线程名字
//            System.out.println(Thread.currentThread().getName()+"---------"+i);
//        }
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        for (int i = 1; i <= 36; i++) {
            System.out.print(".");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 6 == 0){
                System.out.println();

            }
        }
        long time1 = date.getTime();
        date.getDate();
        System.out.println(time1);
        System.out.println(time1 - time);
        throw new 心里没什么数异常();
    }
}
