package com.lanou3g.study;

public class Main5 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ThreadDemo t1 = new ThreadDemo("测试",ticket);
        //黄霑，罗大佑，徐克
        t1.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30 ; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket.continued();
                }

            }
        }).start();
    }
}
