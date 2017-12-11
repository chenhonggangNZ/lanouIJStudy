package com.lanou3g.study;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object ob = 1;
        System.out.println(ob.getClass().getName());

    /*
    psvm main方法的快捷键
    sout 输出语句的快捷键
     */
    /*
        集合
        什么是集合
        在使用数组时发现了数组的长度在初始化时已经定义好的，不可改变

        在事后我们学习一下集合
        集合也可以装在一些元素，并且集合的大小是可以改变的
     */
        //这里创建了一个集合对象
        List list = new ArrayList();
        //通过观察我们可以发现List是一个接口
        //那么ArrayList一定是List接口的一个实现类
    /*
    java 中类最多只能继承一个类
    java中只支持单继承
    但是java中支持多实现
    多实现：一个类可以实现多个接口
    多个接口之间通过逗号分隔
     */
    /*
    length
    数组的长度，是一个属性
    length（）是字符串的长度，是一个方法
    size
    是集合的方法，获取集合的长度
    给集合添加一个元素
     */
        list.add("张三");
        list.add(1);
        list.add(new Student());
        System.out.println(list.size());
        for (int i = 0 ;i < list.size(); i++){
            Object obj = list.get(i);
            System.out.println(list.get(i));
            System.out.println("第" + i + "个元素的值为：" +list.get(i));
        }
    /*
    基本数据类型包装类
    八大基本数据类型，每一个类型都偶有一个包装类
    包装类，其实就是一个class，就是一个类型  喜羊羊与灰太狼
    可以创建该类型的对象
    只有神知道的世界 从零开始的异世界生活 零之使魔 记录的地平线 lovelive 为美好的世界献上祝福  悠哉日常大王 双子星公主 纯白交响曲 鸟之诗
    你的名字 我的青春恋爱物语果然有问题  我的妹妹怎么可能这么可爱 南家三姐妹 爱神巧克力 守护甜心 魔法少女伊莉雅  小魔女学园  可塑性记忆  全职法师 NewGame
     珈百璃的堕落  我太受欢迎该怎么办

    对应关系
    int  Integer
    char Character
    byte Byte
    short Short
    long Long
     float Float
     double Double
     boolean Boolean
     除了int 和char 其他都是基本数据类型的大驼峰结构



     日常，治愈系，甜美系，清纯系，具有理想意义的战斗番  歌颂爱情，传递善良与守护。代表深远，思恋（你的名字）理想主义 民主集中 追求群体利益的最大化
     灵魂

     洒脱，自由，激情，热血，现实。流于现实。（精神：不在一个世界） 民主 追求个体利益的最大化（个例）概率化

     青春 洒脱 阳刚 潇洒  理想归于现实 （羡慕） 谈判 一点就着，好聚好散

     极端  狂热 蛮不讲理 （感动）偶和

     黑暗 欺负人 势力 （自己人）  誓约 惹不起 也不用怕 离得远点

     自动拆箱和自动装箱

     Integer a = 1 ;//自动装箱
     //a = new Integer(1);
     int b = a ;自动拆箱
     */

    Integer a = 1;
    int b = a;


    }
}
