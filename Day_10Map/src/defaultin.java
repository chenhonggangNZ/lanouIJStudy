import java.util.HashMap;
import java.util.Map;

public class defaultin {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("张三","20");
        map.put("李四","30");
        map.put("王五","23");
        //第一种方法
        for (Object o: map.entrySet()) {
            Map.Entry entry = (Map.Entry)o;
            System.out.println("key的值为："+ entry.getKey() +"value的值为：" +entry.getValue());
        }
        //第二种方法

        for (Object o: map.entrySet()) {
            System.out.println("key的值为：" +map.get(o).toString());
        }

        //三
//        for (Object o: map.entrySet().iterator()) {
//
//
//        }
    }
}
