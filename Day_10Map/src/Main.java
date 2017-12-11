import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Map是什么；
        是一个接口
        Map可以存放数据；
        map存放的数据，都是键值对形式的。
        什么是键值对？
        name = "张三";
        age = 1;
        gender = "";
        这种--对应的关系，就叫做键值对
         */

        List l = new ArrayList();
        l.add("张三");
        l.add("李四");
        Map map =  new HashMap();
        map.put("name","zhangsan");
        map.put("name","lisi");
        map.put("gender","nv");
        map.put("age","14");
        Map map1 = new HashMap();
        //put方法，向map中添加信息
        //括号中接收两个参数
        //第一个参数标表示key（键）
        //第二个参数表示value（值）
        map1.put("name","王五");
        map1.put("gender","男");
        map1.put("age","11");
              firstMain(map1);
//              second(map1);
//            iterate(map, entry);


    }

    private static void firstMain(Map map1) {
        System.out.println("开始遍历了。");
//        System.out.println(map1.get("name"));
        for (Object o : map1.keySet()){
            //map1.keySet就是将map中的所有的key拿出来
            //增强for，也叫foreach
            //冒号后，就是接收一个集合
            //也就是接收了一堆数据
            System.out.println(o +map1.get(o).toString());

        }
    }

    private static void second(Map map1) {
        System.out.println("遍历map的第二种方式");
        //获得M这个map中的所有键值对
        //放进了这个set的集合中
//        Set set = map1.entrySet();
        /*
        collection是一个接口
        list和set都是collection的子接口

        我们使用的集合ArrayList只是List的一个实现类
        List: 有序（通过脚标找元素），可重复
        set：无需，不可重复
         */
        for (Object o : map1.entrySet()) {
        //一个Entry的实现类对象，就表示一个键值对
        //可以使用这个对象，获得key和value

            Map.Entry entry = (Map.Entry) o;
            System.out.println("key的值为" + entry.getKey() + "---value的值为：" +entry.getValue());
            System.out.println(o.getClass().getName());
        }


    }


    private static void iterate(Map map, Map.Entry entry) {
        //迭代器
        System.out.println("开始使用迭代器遍历集合");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            //如果有下一个，则返回true，进入到while循环
            //获得的对象，是object类型的
            //父类的以及用next，只能使用父类的方法
            //无法使用子类独有的方法
            Object next = iterator.next();
            //所以要把next强转成子类
            Map.Entry entry01 = (Map.Entry) next;
            System.out.println("key的值为" + entry.getKey() + "---value的值为：" +entry.getValue());

        }
    }


}
