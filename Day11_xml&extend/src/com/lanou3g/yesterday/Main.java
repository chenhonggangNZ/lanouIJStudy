package com.lanou3g.yesterday;

public class Main {
    public static void main(String[] args) {
        DateBaseUtil<Student> dub = new DateBaseUtil();
        dub.save(new Student());
        dub.findById(0);
        DateBaseUtil<Teacher> dbu2 = new DateBaseUtil();
        dbu2.save(new Teacher());
        dbu2.findById(0);


    }

    //两个在方法中使用的例子
    public  static <T>  void test(){

    }

    public static <E> E test2(){
        return null;
    }
}
