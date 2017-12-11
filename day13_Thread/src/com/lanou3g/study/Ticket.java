package com.lanou3g.study;

public class Ticket {
    public void sellTick(){
        //大括号：代码块
        //synchronized:同步
        //所以这个代码块叫1同步代码块
        //synchronize后面面的括号中
        //要传入的，就是这个同步块的锁对象
        //this指的是本类对象
        //Ticket.class指的是这个类的类对象
        //类型为Ticket
        //类对象的类型为class

        synchronized (Ticket.class){
            for (int i = 0; i < 10; i++) {
                try {
                    //请你等一等
                    //一旦所对象调用wait方法
                    //那么当前运行的线程，就会失去执行权，并且失去争抢执行权的权利
                    Ticket.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("转了一圈---"+i);
            }
        }

    }

    public void  continued(){
        //
        synchronized (Ticket.class) {
            Ticket.class.notifyAll();
        }
    }
}
