package com.lanou3g.study;

public class Main2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new HelloRunnable());
        thread.run();
        thread.start();
        /*
        什么是GC？
        GC是java中的垃圾回收机制
        java在内存中创建的对象，程序员是不能手动销毁的，这也是java相对于c的一个好处
        c的程序员都需要手动销毁内存中的内容
        ，而我们java程序员就不需要做这个工作，有java内部的管理机制帮组我们管理内存

        GC就是帮组我们把内存中不用的对象销毁掉，释放内存空间
        当一个main方法执行时
        实际上启动了两个线程，一个是主线程，一个是GC
        Gc什么时候销毁，由Gc,与我们没有关系
         */

        /*
        线程的抢占式执行
        多个线程共同争抢cpu的执行权
         */
    }
}
