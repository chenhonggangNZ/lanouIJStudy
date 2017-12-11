package com.lanou3g.study;

public class TicketDemo {
    private static int ticket = 10000;
    /*
        锁
        首先要明确一点，锁是个对象，而且可以是任意类型的对象

        synchronize关键字，就可以给方法上一道锁，给方法上锁的时候，使用的对象就是当前类的类对象
        就是TicketDemo.class对象

        当一个线程进入到sellTicket方法时，该线程就会持有这个锁对象
        其他进程想进入sellTicket方法时，
        找不到锁对象，所以进不去
        这时候就只能等待，前一个进程执行完毕后，从方法出来，释放锁对象，下一个线程才能进入
        这个现象就是同步excuse
     */

    public  synchronized void sellTicket(){
        for (int i = 0; i < 2500; i++) {

            System.out.println(Thread.currentThread().getName()+"剩余票数："+(--ticket) );
        }
    }
    public static void main(String[] args) {

    }
}
