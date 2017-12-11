package com.lanou3g.study;

public class Main4 {
    public static void main(String[] args) throws 心里没什么数异常 {
        /*
            synchronized
            同步：如果你先开始了，那等你干完了我在开始
            异步：你干你的，我干我的

         */
        TicketDemo td = new TicketDemo();
        startSell(td);
        startSell(td);
        startSell(td);
        startSell(td);
        throw new 心里没什么数异常();
    }

    private static void startSell(TicketDemo td) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                td.sellTicket();
            }
        }).start();
    }
}
