import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public Main2() {
    }

    public static void main(String[] args) {
//        first();
//        second();
//        third();
            Map<String,List<Rice>> map = new HashMap<>();
             List<Rice> 饭桶一号 = new ArrayList<>();
                 饭桶一号.add(new Rice("盘锦大米"));

            List<Rice> 饭桶二号 = new ArrayList();
                饭桶二号.add(new Rice("热干面"));
            map.put("一号",饭桶一号);
            map.put("",饭桶二号);
            for (String s: map.keySet()){
                List<Rice> rice = map.get(s);
                for (int i = 0; i < rice.size(); i++) {
                    System.out.println(rice.get(i));
                }

            }
    }

    private static void third() {
        List<Rice> 饭桶一号 = new ArrayList<>();
        饭桶一号.add(new Rice("盘锦大米"));

        List<Rice> 饭桶二号 = new ArrayList();
        饭桶二号.add(new Rice("热干面"));

        List<List<Rice>> 饭库 = new ArrayList();
        饭库.add(饭桶一号);
        饭库.add(饭桶二号);

        for (int i = 0; i < 饭库.size() ; i++){
            List<Rice> 饭桶 = 饭库.get(i);
            for (int j = 0 ; j < 饭桶.size(); j++){
               Rice rice  =  饭桶.get(j);
                System.out.println(rice);
            }
//            饭库.get(i).get(i);
        }
    }

    private static void second() {
        Map<String,Student> map = new HashMap<>();
        map.put("张三",new Student());
        Student 张三 = map.get("张三");
    }

    private static void first() {
    /*
        泛型，
     */
        List<String> list =  new ArrayList<>();//面向接口
        list.add("张三");
        list.add("李四");
        list.set(1,"王五");
        //增强for循环
        //是不可以改变集合中的元素的
        for (String s : list) {
            s = "王五";
//            System.out.println(s);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
