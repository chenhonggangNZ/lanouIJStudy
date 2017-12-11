package com.lanou3g.yesterday.toDay;

import com.lanou3g.yesterday.Student;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private int i = 0;
    private int j = 0;

    public static void main(String[] args) {
        List<Person <Student>> list = new ArrayList<>();
        Map<String,List<Rice>> map = new HashMap<>();
        Map map1 = new HashMap();
        map1.put(new Person(),new Student());


    }
    @Test
   public void t1(){
       //刚刚他添加的就是Java的测试包
        //使用这个包中的@Test注解
        //就可以单独运行这个t1方法
        /*
            递归
            递归就是自己调自己
         */
        practice(1);

   }

   public void show(){
       System.out.println("第"+ (++i) + "次调用");
       while (i < 500) {
           j =i + 1;
//           practice(9);

       }

       System.out.println("第" +j +"次调用结束");
       j--;

    }

    public void practice(int num){
       for (int i = 1; i <= num; i++){
           System.out.print(i + "*" +num + "=" +(i*num));
           System.out.print("\t");
       }
        System.out.println();
        num++;
        if (num == 10){
            return;
        }
        practice(num);

    }

    @Test
    public  void t2() throws IllegalAccessException, InstantiationException {
        /*
            反射是用来干什么的？
            反射可以帮我们在没有对象的情况下
            仅仅只有类的情况下，调用非静态方法，
            调用私有方法与属性
         */
        //类对象
        //instance 实例
        //称呼不同，一个Hero类的实例
        //就是一个Hero类的对象
//        Hero hero01 = Hero.class.newInstance();
//        Hero.class.getMethod()
    }


    @Test
    public void t3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        showName("张三");
        showName("张三","李四");
//        showName(1,"fddj",new Hero());
        String[] ns = {"sad","sd","ds","sd","ds","sd"};
//        可以给你多个字符串
//        也可以单个给一个数组
//        但是不能字符串和数组一起给
//        showName(ns);
        //方法对象
        Method skill = Hero.class.getMethod("skill");
        Hero hero1 = Hero.class.newInstance();
        skill.invoke(hero1);
    }


    /**
     * 演示可变参数
     * @param names
     */
    public void showName(String... names){
        //在方法体中，将参数names看成一个数组
        //数组的类型为String
        for (String name: names) {
            System.out.println(name +"\t");
        }
        System.out.println("完成");
    }

    @Test
    public void t4() throws Exception {

        Student instance = Demo.getInstance(Student.class);
        Object instance1 = Demo.getInstance("com.lanou3g.yesterday.toDay.Hero");
        System.out.println(instance1);
    }
}
