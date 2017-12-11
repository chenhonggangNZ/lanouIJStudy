package com.lanou3g.yesterday.toDay;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static <T> T getInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        //使用类对象clazz，创建一个对象
        //因为这时候，我们也不确定这个类对象是什么类型的
        //编译器也不确定，所以得到的返回值是Object
        //使用类对象Clazz，创建了一个对象
        //类对象中指定了泛型T
        //
        T t = clazz.newInstance();
        return t;
    }

    @Test
    public static  Object getInstance(String className) throws Exception {
//        只需要使用一个字符串形式的类名
//        即可获得该类的类对象

        Class<?> aClass = Class.forName(className);
        //通过类对象，获取该类型对象
        Object o = aClass.newInstance();

        //通过类对象的方法，获得该类的name属性
        Field name = aClass.getDeclaredField("name");

        //参数一：方法名，参数二参数列表中每个参数的类型
        //注意参数二接收的是一个可变参数
        //所以可以传入任意参数类型
        Method show = aClass.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        show.invoke(o,"钓个鱼");
        //打破私有权限的限制
        name.setAccessible(true);

        //调用属性对象name的set方法
        //参数已接收的是，要给那个对象的属性name赋值
        //参数而接收的是要赋的值
        name.set(o,"盖伦");
        System.out.println(o.toString());
        return o;

    }
}
